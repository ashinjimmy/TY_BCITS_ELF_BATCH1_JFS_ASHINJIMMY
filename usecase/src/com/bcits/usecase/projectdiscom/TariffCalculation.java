package com.bcits.usecase.projectdiscom;

public class TariffCalculation {

	public static double residentil(long initialReading, long finalReading) {
		long units = finalReading - initialReading;
		double bill = 0;
		if (units < 100) {
			bill = units * 4;
		} else if (units < 200) {
			bill = (100 * 4) + ((units - 100) * 5);
		} else if (units > 200) {
			bill = (100 * 4) + (100 * 5) + ((units - 200) * 8);
		}
		return bill;
	}

	public static double commercial(long initialReading, long finalReading) {
		long units = finalReading - initialReading;
		double bill = 0;
		if (units < 1000) {
			bill = units * 10;
		} else if (units < 2000) {
			bill = (1000 * 10) + ((units - 1000) * 15);
		} else if (units > 2000) {
			bill = (1000 * 10) + (1000 * 15) + ((units - 2000) * 18);
		}
		return bill;
	}

	public static double industry(long initialReading, long finalReading) {
		long units = finalReading - initialReading;
		double bill = 0;
		if (units < 10000) {
			bill = units * 15;
		} else if (units < 20000) {
			bill = (10000 * 15) + ((units - 10000) * 20);
		} else if (units > 20000) {
			bill = (10000 * 15) + (10000 * 20) + ((units - 20000) * 25);
		}
		return bill;
	}

}
