package com.example.loanapi.repo;

import com.example.loanapi.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanRepo extends JpaRepository<Loan,Long> {

    Optional<Loan> findById(Long id);
}
