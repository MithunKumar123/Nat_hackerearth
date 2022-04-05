package com.natwest.api.model;

import com.natwest.api.config.Currency;
import com.natwest.api.config.TransactionTypes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "bank_transaction")
@Getter
@Setter
public class BankTransaction extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "account_from")
    private Long accountFrom;

    @Column(name = "type_of_transaction")
    private TransactionTypes types;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "currency")
    private Currency currency;

    @Column(name = "account_to")
    private Long accountTo;

}
