package com.example.loanapi.service;

import com.example.loanapi.model.Loan;

import java.util.List;

public interface LoanService {

    Loan createLoan(Loan loan);
    List<Loan> allLoans();
    Loan getLoanById(long id);
    void deleteLoan(long id);


}
