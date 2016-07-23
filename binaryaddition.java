/*https://discuss.leetcode.com/topic/19284/13-lines-easy-java-solution-simple-and-elegant
	
	Given two binary strings, return their sum (also a binary string).

			For example,
			a = "11"
			b = "1"
			Return "100".*/
package NumberofCharcter;

public class binaryaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010";
		String b="11";
		
		int lena = a.length();
		int lenb = b.length();
		
		int i=0 , carry = 0;
		String res = "";
		
		while(i<lena||i<lenb || carry!=0){
			
			int x = (i<lena) ? (Character.getNumericValue((a.charAt(lena-1-i)))) : 0;
			int y = (i<lenb) ? (Character.getNumericValue(b.charAt((lenb-1-i)))) : 0;
			
			res = (x+y+carry)%2 + res;
			carry = (x+y+carry)/2;
			i++;
		}
		System.out.println(res);
	}

}
