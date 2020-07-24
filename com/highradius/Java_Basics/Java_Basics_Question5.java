package com.highradius.Java_Basics;

import java.util.Scanner;

public class Java_Basics_Question5 {
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        System.out.println("Enter test case");
        int q=sc.nextInt();
        int a,b,n;
        for(int i=0;i<q;i++)
        {
       
        	int re;
        	System.out.println("Enter a,b,n");
        	a=sc.nextInt();
        	b=sc.nextInt();
        	n=sc.nextInt();
        	re=a;
        	for(int j=0;j<n;j++)
        	{
        		re =re+(int)Math.pow(2,j)*b;
        		System.out.print(re+" ");
        	}
        }
        System.out.println("");

}


}
