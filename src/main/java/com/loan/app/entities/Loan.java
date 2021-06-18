package com.loan.app.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private UUID loanId;
    @Column(nullable = false)
    private Long amount;
    @Column(nullable = false)
    private Integer term;
    @Column(nullable = false)
    private Double principal;
    @Column(nullable = false)
    private LocalDateTime requestedDate;
    @Column(nullable = false)
    private LocalDateTime dueDate;
    private LocalDateTime lastUpdate;

   /* @Override
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }*/
}



