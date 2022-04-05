package com.natwest.api.repository;

import com.natwest.api.model.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepo extends JpaRepository<BankTransaction, UUID> {
}
