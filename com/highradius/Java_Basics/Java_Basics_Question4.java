package com.highradius.Java_Basics;

import java.util.Scanner;

public class Java_Basics_Question4 {
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        System.out.println("Enter test case and number of input");
		int t,n;
		t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			try {
				n=sc.nextInt();
				System.out.println(n+"can be fitted in:");
				if(n<127 && n>-128)
				{
					System.out.println("Byte");
				}
				if(n<32767  && n>-32768)
				{
					System.out.println("Short");
				}
				if(n<2147483647  && n>-2147483648)
				{
					System.out.println("Int");
				}
				if(n<9223372036854775807l && n>-9223372036854775808l)
				{
					System.out.println("Long");
				}
				
			 }
			catch(Exception e)
			{
				System.out.println("can't be fitted anywhere.");
			}
		}
    }

}
