package com.example.loanapi.controller;

import com.example.loanapi.model.Loan;
import com.example.loanapi.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LoanController {
    @Autowired
    private LoanService loanService;
    @PostMapping("/loan")
    @ResponseStatus(HttpStatus.CREATED)
    public Loan createLoan(@RequestBody Loan loan){
        return loanService.createLoan(loan);
    }
    @GetMapping("/loan")
    @ResponseStatus(HttpStatus.OK)
    public List<Loan> getAllLoans(){
        return loanService.allLoans();
    }
    @GetMapping("/loan/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Loan getByLoanId(@PathVariable long id){
        return loanService.getLoanById(id);
    }
    @DeleteMapping("/loan/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLoan(@PathVariable long id){
        loanService.deleteLoan(id);
    }
}
