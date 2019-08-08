package com.malex.session_2;

public class Assignment_5b {
	public static void main(String[] args){
		int x = 121;
		isPrime(x);
		isPalindrome(x);
	}
	
	public static void isPrime(int a){
		boolean ans = false;
		for(int i = 2; i < a; i++){
			if(a % i == 0)
				ans = true;
			else
				ans = false;
		}
		if(ans)
			System.out.println(a + " is Prime!");
		else
			System.out.println(a + " is not Prime!");
	}
	
	public static void isPalindrome(int a){
		String str = "" + a;
		String pal = "";
		for(int i = str.length() - 1; i >= 0; i--){
			pal = pal + str.charAt(i);
		}
		
		if(pal.equals(str))
			System.out.println(str + " is a Palindrome!");
		else
			System.out.println(str + " is not a Palindrome!");
	}
}
