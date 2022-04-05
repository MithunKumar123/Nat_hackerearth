package com.natwest.api.controller;


import com.natwest.api.model.BankTransaction;
import com.natwest.api.model.ResponseModel;
import com.natwest.api.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @PostMapping("/saveTransactions")
    public ResponseEntity<ResponseModel> saveTransaction(@RequestBody BankTransaction bankTransaction){
        return ResponseEntity.ok(transactionService.saveTransaction(bankTransaction));
    }

}
