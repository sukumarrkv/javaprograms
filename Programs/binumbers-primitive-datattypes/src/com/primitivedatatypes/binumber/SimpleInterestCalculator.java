package com.primitivedatatypes.binumber;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
     SICalculator calculate = new SICalculator("4500", "7.5");
    		 BigDecimal totalValue = calculate.calculateTotalValue(5);
     System.out.println(totalValue);

	}

}
