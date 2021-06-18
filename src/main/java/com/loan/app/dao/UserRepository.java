package com.loan.app.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.loan.app.entities.User;


public interface UserRepository  extends JpaRepository<User,Integer>{
	
	@Query(value="UPDATE User SET password=:p WHERE email=:n")
	public String setPasswordByEmail(@Param("p") String p,@Param("n") String email);

}

