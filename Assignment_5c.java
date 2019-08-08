package com.malex.session_2;

public class Assignment_5c {
	public static void main(String[] args){
		isArmstrong(371);
	}
	
	public static void isArmstrong(int a){
		String str = "" + a;
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
			int x = (int)str.charAt(i) - 48;
			sum += x * x * x;
		}
		if(sum == a)
			System.out.println(a + " is an Armstrong Number.");
		else
			System.out.println(a + " is not an Armstrong Number.");
	}
}
