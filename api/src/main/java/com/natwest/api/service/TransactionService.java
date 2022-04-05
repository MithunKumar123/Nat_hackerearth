package com.natwest.api.service;

import com.natwest.api.exception.TransactionException;
import com.natwest.api.model.BankTransaction;
import com.natwest.api.model.ResponseModel;

public interface TransactionService {

    ResponseModel saveTransaction(BankTransaction bankTransaction) throws TransactionException;

}
