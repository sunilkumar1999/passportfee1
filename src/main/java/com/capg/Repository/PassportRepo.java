package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.Model.Passport;

public interface PassportRepo extends JpaRepository<Passport,String> {

}
