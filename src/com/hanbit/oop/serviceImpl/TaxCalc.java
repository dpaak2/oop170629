package com.hanbit.oop.serviceImpl;

public class TaxCalc {
	public double taxCalc(int salary) {
		salary=0;
		double taxRate = 0;

		if (88000 < salary) {
			taxRate = 0.35;
		} else if (4600 < salary) {
			taxRate = 0.26;
		} else if (1200 < salary) {
			taxRate = 0.17;
		} else {
			taxRate = 0.08;
		}
		// ()?;:
		return taxRate;
	}
}
