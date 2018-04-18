package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : numbers)
		{
		    intList.add(i);
		}

		List<Integer> intListPrimes = intList.stream()
										.filter(Exam::isPrime)
										.collect(Collectors.toList());
		
		int[] nummers = new int[intListPrimes.size()];
		for(int i = 0;i < nummers.length;i++) {
			nummers[i] = intListPrimes.get(i);
		}
		  
        return nummers;
	}
	
	public static boolean isPrime(int number) {

	    // Even numbers
	    if (number % 2 == 0) {
	        return number == 2;
	    }

	    // Oneven nummers
	    int limit = (int)(0.1 + Math.sqrt(number));
	    for (int i = 3; i <= limit; i += 2) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
		string = string.replaceAll("[^A-Za-z0-9]+", "");
		List<String> stringList = new ArrayList<String>();
		
		for(int i=0; i<string.length(); i++){
			stringList.add(string.substring(i, i+1));
		}
		
		Long aantal = stringList.stream()
									.filter(Exam::isUpperCase)
									.count();
		
		return Math.toIntExact(aantal);
	}
	
	public static boolean isUpperCase(String string) {
		if (Character.isUpperCase(string.charAt(0))) {
			return false;
		} else {
			return true;
		}
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		int sum = points.stream()
					.map(p -> (int)p.getX())
					.reduce(0, (a,b) -> a + b);
		return sum;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		String 
		
	}
}
