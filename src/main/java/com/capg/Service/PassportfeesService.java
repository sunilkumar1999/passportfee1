package com.capg.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Passport;
import com.capg.Model.Passport_Fees;
import com.capg.Repository.PassportRepo;
import com.capg.Repository.PassportfeesRepo;

@Service
public class PassportfeesService {
	@Autowired
	PassportfeesRepo repo;
	@Autowired
	PassportRepo PRepo;

	public Passport_Fees addPassportfees(Passport_Fees ps) {
		
		
		
		long maxnum=repo.countById("IND-");
		String n1 = String.valueOf(maxnum+1);
		Passport pass=PRepo.findById(ps.getTemporaryNo()).get();
		String type=pass.getBookletType();
		String size=String.valueOf(type.charAt(0))+String.valueOf(type.charAt(1));
		if(size.equals("30")) {
			ps.setTypeOfService("Normal");
		    ps.setAmount(2500);
		}
		else
		{
			ps.setTypeOfService("Tatkal");
		    ps.setAmount(3000);
		}
		int k=n1.length();
	    for(int i=0;i<4-k;i++) {
			n1="0"+n1;
		}
		String ss = "IND-" + n1;
		ps.setPassportNo(ss);
		ps.setPaymentDate(LocalDate.now());

		return repo.save(ps);

	}

}
