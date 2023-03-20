package com.demo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elements:-");
		for(int i=0;i<a.length;i++)
		{
		a[i]=s.nextInt();
		}
		System.out.println("The array elements are:-");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		



	}

}
