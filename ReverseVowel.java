package NumberofCharcter;
import java.util.*;

public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String input = "Dheeraj";
//		String vowel = "aeiouAEIOU";
//		char[] c = input.toCharArray();
//		int i=0;
//		int j=c.length-1;
//		
//		while(i<j){
//			if(vowel.contains(Character.toString(c[i])) && vowel.contains(Character.toString(c[j])))
//			{
//				char temp = c[i];
//				c[i] = c[j];
//				c[j] = temp;
//				
//			}
//			i++;
//			j--;
//			
//		}
//			System.out.println(new String(c));
		
		String vowel = "aeiouAEIOU";
		String s = "Dheeraj";
	    char[] c = s.toCharArray();
	    int i=0,j=c.length-1;
	    while(i<j){
	        if(vowel.contains(Character.toString(c[i]))&&vowel.contains(Character.toString(c[j]))){
	            char tmp = c[i];
	            c[i++] = c[j];
	            c[j--] = tmp;
	        }
	        if(!vowel.contains(Character.toString(c[i]))) i++;
	        if(!vowel.contains(Character.toString(c[j]))) j--;
	    }
	    System.out.println(new String(c)); 
	}

}
