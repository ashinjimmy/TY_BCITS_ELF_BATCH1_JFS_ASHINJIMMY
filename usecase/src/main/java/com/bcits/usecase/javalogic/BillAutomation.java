package com.bcits.usecase.javalogic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.bcits.usecase.beans.ConsumerDetails;
import com.bcits.usecase.tariffcalculation.TariffCalculation;

public class BillAutomation {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<Integer, ConsumerDetails> map = new HashMap<>();

		int empId = EmployeeLogin.input();

		while (true) {
			Decision.decision();

			int choice = Integer.parseInt(scanner.nextLine());
			if (choice == 1) {

				int typeOfConsumer = 0;
				try {

					System.out.println("\nSelect the type of Consumer from the given details");
					System.out.println("1. Residential");
					System.out.println("2. Commercial");
					System.out.println("3. Industrial");

					typeOfConsumer = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					System.out.println("Enter Valid Type");

				}
				System.out.println("Enter the Consumer Name ");
				String Name = scanner.nextLine();
				int ConsumId = 0;
				int initReading = 0;
				int finalReading = 0;
				try {
					System.out.println("Enter the Consumer Id ");
					ConsumId = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter the Initial Reading ");
					initReading = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter the Final Reading");
					finalReading = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
					System.err
							.println("CHARACTERS OR SPECIAL CHARACTERS ARE INVALID, PLEASE ENTER VALID ID AND READING");
				}

				switch (typeOfConsumer) {

				case 1:

					double rBillAmount = TariffCalculation.residentil(initReading, finalReading);
					System.out.println("Bill Amount = " + rBillAmount);
					ConsumerDetails cons1 = new ConsumerDetails(ConsumId, Name, rBillAmount, "Residential");
					System.out.println();
					map.put(ConsumId, cons1);
					break;

				case 2:

					double cBillAmount = TariffCalculation.commercial(initReading, finalReading);
					System.out.println("Bill Amount = " + cBillAmount);
					ConsumerDetails cons2 = new ConsumerDetails(ConsumId, Name, cBillAmount, "Commercial");
					map.put(ConsumId, cons2);
					System.out.println();
					break;

				case 3:

					double iBillAmount = TariffCalculation.industry(initReading, finalReading);
					System.out.println("Bill Amount = " + iBillAmount);
					ConsumerDetails cons3 = new ConsumerDetails(ConsumId, Name, iBillAmount, "Industrial");
					map.put(ConsumId, cons3);
					System.out.println();
					break;
				}

			} else if (choice == 2) {

				Set keys = map.keySet();
				Iterator itr = keys.iterator();
				if (itr.hasNext()) {
					System.out.println("----------DETAILS---------------");
					while (itr.hasNext()) {
						ConsumerDetails consumer = map.get(itr.next());
						System.out.println("----------------------------------");
						System.out.println("Consumer Name   : " + consumer.getConsumerName());
						System.out.println("Consumer ID     : " + consumer.getConsumerId());
						System.out.println("Consumer type   : " + consumer.getConsumerType());
						System.out.println("Bill Amount     : " + consumer.getBill());
						System.out.println("\n------------------------------");
					}
				} else {
					System.err.println("No Record Found");
				}

			}

		}

	}
	

}
