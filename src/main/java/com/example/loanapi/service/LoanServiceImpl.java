package com.example.loanapi.service;

import com.example.loanapi.model.Loan;
import com.example.loanapi.repo.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoanServiceImpl implements LoanService{
    @Autowired
    private LoanRepo loanRepo;
    @Override
    public Loan createLoan(Loan loan) {
        return loanRepo.save(loan);
    }

    @Override
    public List<Loan> allLoans() {
        return loanRepo.findAll();
    }

    @Override
    public Loan getLoanById(long id) {
        return loanRepo.getById(id);
    }

    @Override
    public void deleteLoan(long id) {
        loanRepo.deleteById(id);

    }
}
