package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime 
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println(dd+"/"+mm+"/"+yy);
		
		int hr=time.getHour();
		int mn=time.getMinute();
		int sc=time.getSecond();
		int na=time.getNano();
		System.out.println(hr+":"+mn+":"+sc+":"+na);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//We can represent a particular Date and Time by using LocalDateTime object
		LocalDateTime dt1=LocalDateTime.of(1995,Month.APRIL,28,12,45);
		System.out.println(dt1);
	}
}
