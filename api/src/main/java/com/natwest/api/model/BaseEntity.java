package com.natwest.api.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity implements Serializable {

    @Column(name = "created_at")
    private Date createdTime;

    @PrePersist
    protected void prePersist(){
        if(this.createdTime == null){
            createdTime = new Date();
        }
    }


}
