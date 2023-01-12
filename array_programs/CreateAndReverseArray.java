package com.array_programs;

import java.util.Scanner;

public class CreateAndReverseArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		System.out.println("Enter "+size+" array elements");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reversing array");
		for(int k=a.length-1;k>=0;k--)
		{
			System.out.println(a[k]);
		}
		sc.close();
	}
}