package NumberofCharcter;

import java.util.Arrays;
import java.util.Scanner;

public class Ruff1 {

	public static void main(String[] args) {
		String s = "sky is blue";
		 String[]  arr = s.split(" ");
	        String[] output = new String[arr.length];
	        
	        for(int i=0;i<arr.length;i++){
	            output[i] = arr[arr.length-1-i];
	        }
	        System.out.println((Arrays.toString(output)).toString());
			
		}
	    
	}


