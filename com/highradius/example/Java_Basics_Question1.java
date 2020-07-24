package com.highradius.example;
import java.io.*;
import java.util.*;
interface MyCalculator
{
	public long power(int x,int y);
}
public class Java_Basics_Question1 implements MyCalculator {
    @SuppressWarnings("resource")
	public static void main(String[] args)throws IOException
    {
    	Scanner sc=new Scanner(System.in);
    	Java_Basics_Question1 a=new Java_Basics_Question1();
    	int c,b;
    	System.out.println("Enter number and power");
    	c=sc.nextInt();
        b=sc.nextInt();
        try
        {
            if(b<0 || c<0)
            {
                throw new NumberFormatException("Number cannot be negative");
            }
            if(b==0 || c==0)
            {
                throw new NumberFormatException("Number cannot be zero");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception :"+e);
        }
    	System.out.print(a.power(b,c));
    	sc.close();
    }
    public long power(int a,int b)
    {
    	int pow=1;
    	for(int i=1;i<=b;i++)
    		pow=pow*a;
    	return pow;
    }

}
