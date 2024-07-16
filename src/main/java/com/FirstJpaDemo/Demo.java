package com.FirstJpaDemo;

public class Demo {
	
	public static void test(String str)
	{
		try
		{
			if(str==null)
			{
				throw new NullPointerException();
			}
		
		}
		catch (NullPointerException e) {
			System.out.println("Null values cought");
		}
		
	}

	public static void main(String[] args) {
		test(null);

	}

}
