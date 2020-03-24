package test;

public class test_class {
	static public void main(String[] args) {
		// print
		System.out.println("Hello!");
		
		// This is comment
		/* This is comment */
		
		// variable
		String name = "moon";
		int age = 20;
		float tall = 180.1f;
		char firstNameChar = 'm';
		boolean marry = false;
		
		String firstStr = "mo";
		String secondStr = "on";
		
		String mix_str = firstStr + secondStr;
		
		int small_int = 5;
		int big_int = 10;
		
		int sum = small_int + big_int;
		
		int x=1, y=2, z=3;
		
		// data type
		
		/*
		 * byte = 1byte
		 * short = 2bytes
		 * int = 4bytes
		 * long = 8bytes
		 * float = 4bytes
		 * double = 8bytes
		 * boolean = 1bit
		 * char = 2bytes
		 * */
		
		byte myByte = 0;
		short myShort = 1;
		int myInt = 2;
		long myLong = 3L;
		float myFloat = 3.1f;
		double myDouble = 3.2d;
		boolean myBool = true;
		char myChar = 'm';
		
		String myString = "moon";
		
		
		// type casting 
		
		myInt = myShort; // OK
		//myShort = myInt; // error
		
		myInt = (int)myDouble;
		
		
		// operator
		
		int x_1 = 1, x_2 = 2;
		int x_3 = x_1 + x_2;
		x_3 = x_1-x_2;
		x_3 = x_1*x_2;
		x_3 = x_1/x_2;
		x_3 = x_1%x_2;
		
		int myStrLen = myString.length();
		String myStrUpper = myString.toUpperCase();
		String myStrLower = myString.toLowerCase();
		
		myString.indexOf('m'); // 0
		
		// Math
		
		int max_val = Math.max(5,10);
		
		System.out.print(max_val);
		
		
		
	}

}
