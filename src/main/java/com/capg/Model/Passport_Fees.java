package com.capg.Model;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Passport_Fees {
	
	@Id
	private String passportNo;

    private LocalDate paymentDate;
	private int amount;
	private String typeOfService;
	private String temporaryNo;
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTypeOfService() {
		return typeOfService;
	}
	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}
	public String getTemporaryNo() {
		return temporaryNo;
	}
	public void setTemporaryNo(String temporaryNo) {
		this.temporaryNo = temporaryNo;
	}
	public Passport_Fees() {
		super();
	}
	public Passport_Fees(String passportNo, LocalDate paymentDate, int amount, String typeOfService,
			String temporaryNo) {
		super();
		this.passportNo = passportNo;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.typeOfService = typeOfService;
		this.temporaryNo = temporaryNo;
	}
	@Override
	public String toString() {
		return "Passport_Fees [passportNo=" + passportNo + ", paymentDate=" + paymentDate + ", amount=" + amount
				+ ", typeOfService=" + typeOfService + ", temporaryNo=" + temporaryNo + "]";
	}
	
}