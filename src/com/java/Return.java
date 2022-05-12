package com.java;

public class Return {

	static int a;
	
	public static int eg() {

		a = 40;
		return a;
		
    //	a = 55; we can't change the variable value after return to the method
	}
	
	public static void main(String[] args) {
		
		eg();
	}
}
