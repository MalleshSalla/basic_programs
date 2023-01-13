package com.corejava.assignment9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TradersAndTransactionMain {

	public static void main(String[] args) {
		
		Trader alice = new Trader("Alice", "Cambridge");
		Trader bob = new Trader("Bob", "dilhi");
		Trader charlie = new Trader("Charlie", "Cambridge");
		Trader dan = new Trader("Dan", "London");
		Trader edward = new Trader("Edward", "Hydrabad");
		
		

		List<Transaction> transactions = Arrays.asList(
		    new Transaction(bob, 2011, 300), 
		    new Transaction(alice, 2012, 1000),
		    new Transaction(charlie, 2011, 400),
		    new Transaction(dan, 2012, 710),
		    new Transaction(edward, 2011, 760)
		);
		
		
		// Assignment 8
		
		/*
		 * add some data to the above class and find all transactions in the year 2011
		 * and sort them by value (small to high) in stream
		 */
		List<Transaction> result = transactions.stream()
		                                       .filter(transaction -> transaction.getYear() == 2011)
		                                       .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
		                                       .collect(Collectors.toList());
		
		System.out.println(result);
		System.out.println("--------------");
		
		
		
		// Assignment 9
		/*
		 * System.out.println("what are all the unique cities where the traders works "
		 * );
		 * 
		 * 
		 * List<String> uniqueCities = transactions.stream() .map(s ->
		 * s.getTrader().getCity()) .distinct() .collect(Collectors.toList());
		 * 
		 * System.out.println(uniqueCities);
		 * 
		 * Set<String> uniqueCities1 = transactions.stream() .map(s ->
		 * s.getTrader().getCity()) .collect(Collectors.toSet());
		 * 
		 * System.out.println(uniqueCities1);
		 */
		
		System.out.println("------------");
		System.out.println("what are all the unique cities where the traders works ");
		
		List<String> uniqueCities = 
			    transactions.stream()
			           .map(s -> s.getTrader().getCity())
			           .collect(Collectors.toList());

			List<String> nonRepeatedCities = 
					uniqueCities.stream()
			                .filter(city -> Collections.frequency(uniqueCities, city) == 1)
			                .collect(Collectors.toList());
			
			System.out.println(nonRepeatedCities);
		
		
		
	
		// assignment 10
		System.out.println("-----------");
		System.out.println("find all traders from Cambridge and sort by name");
		List<Transaction> tradersFromLondon = transactions.stream()
			    .filter(trader -> trader.getTrader().getCity().equals("Cambridge"))
			    .sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
			    .collect(Collectors.toList());
		
		System.out.println(tradersFromLondon);
		
		// Assignment 11
		System.out.println("------------");
		System.out.println("Return a String of all traders name sorted alphabetically");
		
		
			Stream<String> string=	transactions.stream()
			           .map(s -> s.getTrader().getName())
			           .sorted();
			string.forEach(System.out::println);
			   
			// using joining method
			String traderNames = transactions.stream()
                    .map(s -> s.getTrader().getName())
                    .sorted()
                    .collect(Collectors.joining(", "));
		
			System.out.println(traderNames);
		
			// Assignment 12
			// Are traders based in Cambridge	
			List<Transaction> basedInCambridge = transactions.stream().filter(s -> s.getTrader().getCity().equals("Cambridge")).collect(Collectors.toList());
			
			basedInCambridge.forEach(System.out::println);
			
			
			//Assignment 13
			// print all transaction values from the traders of Cambridge
			List<Integer> transactionsValues =  transactions.stream()
							.filter(s -> s.getTrader().getCity().equals("Cambridge"))
								.map(s -> s.getValue()).collect(Collectors.toList());
			
			transactionsValues.forEach(System.out::println);
			
			// Assignment 14
			//what is the highest value of transactions
			
			OptionalInt maxValue = 
				    transactions.stream()
				                .mapToInt(s -> s.getValue())
				                .max();
			
			System.out.println("The maximum value of transactions "+maxValue.getAsInt());
			/*
			 * int maxTransactionValue = transactions.stream().map(s
			 * ->s.getValue()).max((s1,s2)->s1.compareTo(s2)).get();
			 * 
			 * System.out.println("The maximum value of transactions "+maxTransactionValue);
			 */
			
			OptionalInt minValue = 
				    transactions.stream()
				                .mapToInt(s -> s.getValue())
				                .min();
			System.out.println("The manimum value of transactions "+minValue.getAsInt());
	}
	

}
