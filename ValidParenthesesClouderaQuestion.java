/*https://discuss.leetcode.com/topic/7813/my-easy-to-understand-java-solution-with-one-stack*/

package NumberofCharcter;
import java.util.Stack;

public class ValidParenthesesClouderaQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="()[]{}";
		
		Stack<Character> s = new Stack<Character>();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='['){
				s.push(input.charAt(i));
			}
			else if(input.charAt(i)==')' && s.peek()=='(' && s.isEmpty()){
				s.pop();
			}else if(input.charAt(i)=='}' && s.peek()=='{' && s.isEmpty())
				s.pop();
			else if(input.charAt(i)==']' && s.peek()=='[' && s.isEmpty()) {
				s.pop();
			}
			else {
				System.out.println("hi");
			}
			
			}
		 System.out.println(s.empty());
	}
}
