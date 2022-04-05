package com.natwest.api.service;

import com.natwest.api.exception.TransactionException;
import com.natwest.api.model.BankTransaction;
import com.natwest.api.model.ResponseModel;
import com.natwest.api.repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    TransactionRepo transactionRepo;

    @Autowired
    ResponseModel responseModel;

    @Override
    public ResponseModel saveTransaction(BankTransaction bankTransaction) {
            try {
                BankTransaction response = transactionRepo.save(bankTransaction);
                if(response == null){
                    responseModel.setMessageCode("NOT_ABLE_TO_SAVE");
                    responseModel.setMessageString("Please try some other time");
                }else{
                    responseModel.setMessageCode("SUCCESSFULLY_SAVED");
                    responseModel.setMessageString("Transaction Persisted");
                }
                return responseModel;
            }catch (TransactionException transactionException){
                responseModel.setMessageCode("EXCEPTION_HAPPENED");
                responseModel.setMessageString("no messages");
                throw new TransactionException();
            }

    }
}
