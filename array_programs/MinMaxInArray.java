package com.array_programs;

public class MinMaxInArray
{
	public static void main(String[] args)
	{
		int arr[]= {49,54,2,5,6,67,35,74,};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
		int min=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println(min);
	}
}