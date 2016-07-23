
/* A Java program to evaluate a given expression where tokens are separated 
   by space.
   http://www.geeksforgeeks.org/expression-evaluation/
   Test Cases:
     "10 + 2 * 6"            ---> 22
     "100 * 2 + 12"          ---> 212
     "100 * ( 2 + 12 )"      ---> 1400
     "100 * ( 2 + 12 ) / 14" ---> 100    
*/
package NumberofCharcter;

import java.util.Stack;

public class EvaluateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "10 + 2 * 6";
		char[] tokens = input.toCharArray();
		Stack<Integer> values = new  Stack<Integer>();
		Stack<Character> ops = new Stack<Character>();
		
		for(int i=0;i<tokens.length;i++){
			if(tokens[i] == ' ')
				continue;
			if()
			
		}

	}

}
