package com.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.app.entities.Admin;
import com.loan.app.entities.User;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
