package com.mmit.day2;

public class operators {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " is equal " + num2 + " is " + (num1 == num2));
		System.out.println(num1 + " is less than " + num2 + " is " + (num1 < num2));
		System.out.println("80 is divisible with 5 and 8 : " + ((80%5 == 0) && (80%8 ==0)));
		String result = (18%2 == 0) ? "even" : "odd";
		System.out.println("18 is " + result);
		num1 += 400;
		num2 -= 100;
		System.out.println("After updating, num1 = " + num1 + ", num2 = " + num2);
		
	}
}
