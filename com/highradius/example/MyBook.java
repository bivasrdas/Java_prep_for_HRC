package com.highradius.example;

abstract class Book
{
	String t;
	public abstract String setTitle(String s);
	public String getTitle(String t)
	{
		return(t);
	}
}
class MyBook extends Book {
	public static void main(String[] args)
	{
		MyBook m=new MyBook();
		System.out.print(m.getTitle(m.setTitle("Two Tales")));
		
	}
	@Override
	public String setTitle(String s) {
		String ti=" The title is:" + s;
		return ti;
	}

}
