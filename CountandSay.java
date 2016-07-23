/*1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.*/


package NumberofCharcter;

import java.util.ArrayList;

public class CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "12211";
		int j;
		
		
		int[] arr = new int[9];
		int[] count = new int[9];
		for(int i=0;i<arr.length;i++){
			arr[i] = i+1;
		}
		for(int x=0;x<input.length();x++){
			 j = Character.getNumericValue(input.charAt(x));
			count[j-1] += 1;
			
		}
		
		for(int x=0;x<input.length();x++){
			 System.out.println(arr[x] +" is " +getNums(count[x])+" times occuring " );
			
		}
		
	}
	
	public static String getNums(int j){
	    if(j==1)
	        return "one";
	    else if(j==2)
	        return "two";
	    else if(j==3)
	        return "three";
	    else if(j==4)
	        return "four";
	    else if(j==5)
	        return "five";
	    else if(j==6)
	        return "six";
	    else if(j==7)
	        return "seven";
	    else if(j==8)
	        return "eight";
	    else if(j==9)
	        return "nine";
	    else return "zero";
	    
	}

}
