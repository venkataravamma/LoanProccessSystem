package com.loan.app.dao;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.app.entities.Loan;

@Repository
public interface LoanRepository  extends CrudRepository<Loan, Long> {

    Optional<Loan> findFirstByLoanIdOrderByRequestedDateDesc(UUID loanId);
}