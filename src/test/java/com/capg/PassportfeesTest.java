/*package com.capg;



import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Model.Passport_Fees;
import com.capg.Repository.PassportfeesRepo;
import com.capg.Service.PassportfeesService;

@SpringBootTest
public class PassportfeesTest {
	
	@Autowired
	private PassportfeesService service;
	
	@MockBean
	private PassportfeesRepo repository;
	
	@Test
	public void PassportTest() {
	 Passport_Fees ps=new Passport_Fees("IND-0001",LocalDate.parse("2022-05-04"),2500,"FPS-300001","Normal");
	 when(repository.save(ps)).thenReturn(ps);
	 assertEquals(ps,service.addPassportfees(ps));
	}

}
*/