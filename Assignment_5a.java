package com.malex.session_2;

public class Assignment_5a {
	public static void main(String[] args){
		printEven();
		printOdd(5, 7);
	}
	
	public static void printEven(){
		for(int i = 2; i <= 100; i+= 2){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public static void printOdd(int n, int s){
		for(int i = s; i < (s + n * 2); i += 2){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
