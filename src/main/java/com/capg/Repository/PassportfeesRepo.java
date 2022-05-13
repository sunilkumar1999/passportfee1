package com.capg.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capg.Model.Passport_Fees;

//@Repository
public interface PassportfeesRepo extends JpaRepository<Passport_Fees,Integer>{
	@Query("SELECT COUNT(p) FROM Passport_Fees p WHERE p.passportNo LIKE CONCAT(:passportNo,'%')")
	int countById(@Param("passportNo") String passportNo);
	

}



