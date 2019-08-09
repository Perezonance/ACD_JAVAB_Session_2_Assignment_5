package com.malex.session_2;

public class Assignment_5d {
	public static void main(String[] args){
		removeDupes("HelloWorld");
	}
	
	public static void removeDupes(String str){
		
		String newStr = "";
		
		char[] list = new char[str.length()];
		
		int step = 0;
		
		//traverse through the string
		for(int i = 0; i < str.length(); i++){
			
			boolean match = false;
			
			for(int j = 0; j < list.length; j++){
				if(list[j] == str.charAt(i)){
					match = true;
					break;
				}
			}
			
			if(match == false){
				newStr += str.charAt(i);
				list[step] = str.charAt(i);
				step++;
			}
			
			
			
			/*
			int step = 0;
			
			boolean reccur = false;
			
			System.out.println(str.charAt(i));
			//Compare to the character list
			for(int j = 0; j < list.length; j++){
				System.out.print(list[j]);
				if(str.charAt(i) == list[j]){
					reccur = true;
					break;
				}else{
					reccur = false;
				}
				
			}
			if(reccur == false){
				newStr += str.charAt(i);
				list[step] = str.charAt(i);
				step++;
			}else{
				
			}
			*/
		}
		System.out.println(newStr);
	}
}

