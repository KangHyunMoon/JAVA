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
		
		int max_val = Math.max(5,10); // 10
		int min_val = Math.min(5,10); // 5
		double sqrt_val = Math.sqrt(64); // 8
		double abs_val = Math.abs(-16.4); // 16.4
		double random_val = Math.random(); // 0<= val <1	
		
		System.out.println(10 > 9); // print true
		
		// condition 
		
		int a = 1001;
		
		if (a > 10) {
			System.out.println(a);
		}
		
		if (true) {
			System.out.println(a);
		}
		
		if (a>10000) {
			// first condition
		}
		
		else if (a > 1000){
			// second condition
		}
		
		else {
			// other
		}
		
		String strRet = a > 10 ? "bigger than 10" : "lower than 10"; 
		
		
		// switch 
		
		switch (a) {
		case 100 :
			break;
		case 10 :
			break;
		default :
			//break;
		}
		
		
		// loops
		
		while (true) {
			System.out.println("in while loop");
			break;
			// if no break? infinite loops..
		}
		
		
		do {
			System.out.println("in do");
		}
		while (false);
		
		
		for (int i=0; i<100; i++) {
			System.out.println(i);
		}
		
		String arr_int[] = {"1", "2", "3", "4"};
		
		for (String str : arr_int) {
			System.out.println(str);
		}
		
	}

}
