package com.ty.bcits.dsalgorithms;

import java.time.Duration;
import java.time.Instant;

public class AlgorithmAnalysis {
	
	public static Long addUpto(Long number) {
		long total = 0;
		for(Long i = 0L; i <= number; i ++ ) {
			total = total + i;
		}
		return total;
	}
	
	public static Long addUptoQuick(Long number) {
		return number * (number + 1)/2;
	
	}
	
	public static void countDurationAddUpto() {
		Long number = 99999L; 
		Instant start = Instant.now();
		System.out.println(addUpto(number));
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUpto took "+ seconds + " seconds");
	}
	
	public static void countDurationAddUptoQuick() {
		Long number = 99999L; 
		Instant start = Instant.now();
		System.out.println(addUptoQuick(number));
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUptoQuick took "+ seconds + " seconds");
	}
	

	public static void main(String[] args) {
		
		countDurationAddUptoQuick();
		countDurationAddUpto();
		 
		
	}

}

