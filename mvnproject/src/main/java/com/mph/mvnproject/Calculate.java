package com.mph.mvnproject;

public class Calculate {
	
	public int add(int... number)
	{
		int result =0;
	
	for(int i: number)
	{
		result =result+i;
		
	}
	return result;
	}
	public int multiply(int... number)
	{
		return 1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));



	}

}
