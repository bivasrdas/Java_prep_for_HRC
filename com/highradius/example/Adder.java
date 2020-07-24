package com.highradius.example;

class Arithmetic 
{
	public int add(int a,int b)
	{
		return (a+b);
	}
}
public class Adder extends Arithmetic
{
 public static void main(String[] args)
 {
	 Adder a=new Adder();
	 System.out.print(a.add(20,50));
 }
}
