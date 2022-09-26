package com.primitivedatatypes.binumber;

import java.math.BigDecimal;

public class SICalculator {

	BigDecimal principal;
	BigDecimal interest;
	
	public SICalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		
		return totalValue;
	}

}
