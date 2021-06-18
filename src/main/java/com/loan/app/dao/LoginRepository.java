package com.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.loan.app.entities.LoginData;
import com.loan.app.entities.User;

@Component
public interface LoginRepository extends JpaRepository<LoginData,String>{

}
