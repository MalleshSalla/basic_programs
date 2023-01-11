package com.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodObject 
{
	public static void main(String[] args)
	{
		//Period object can be used to represent quantity of time
		
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1999,07,28);
		
		Period p=Period.between(birthday, today);
		Period p1 = Period.from(p);
		
		System.out.println("age is"+" "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
	
		System.out.println(p1);
		
	}
}
