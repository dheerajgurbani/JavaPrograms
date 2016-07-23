//How To Reverse Each Word Of A String In Java?
//
//		i/p : “Java Concept Of The Day” 
//		
//		o/p : “avaJ tpecnoC fO ehT yaD”

package NumberofCharcter;

import java.util.*;
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java Concept Of The Day";
		String[] str = input.split(" ");
		String reversestring = "";
		
		for(int i=0;i<str.length;i++){
			
			String word = str[i];
			String reverseword = "";
			
			for(int j=word.length()-1;j>=0;j--){
				reverseword = reverseword + word.charAt(j);
			}
			reversestring = reversestring+reverseword+" ";
			
		}
			System.out.println(reversestring);
	}
	
	
}
