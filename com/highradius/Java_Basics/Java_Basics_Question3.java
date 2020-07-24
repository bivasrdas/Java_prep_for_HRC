package com.highradius.Java_Basics;


abstract class Book
{
	String t;
	public abstract String setTitle(String s);
	public String getTitle(String t)
	{
		return(t);
	}
}
class Java_Basics_Question3 extends Book {
	public static void main(String[] args)
	{
		Java_Basics_Question3 m=new Java_Basics_Question3();
		System.out.print(m.getTitle(m.setTitle("Two Tales")));
		
	}
	@Override
	public String setTitle(String s) {
		String ti=" The title is:" + s;
		return ti;
	}

}
