package NumberofCharcter;

public class CheckPallindrome {

	public static void main(String[] args) {
		
		String input = "Hello";
		String check = "olleH";
		
		String reverse = "";
		
		for(int i =input.length()-1;i>=0;i--)
		{
			reverse = reverse + input.charAt(i);
		}
		if(reverse.equals(check))
		System.out.println("yes");
		else
			System.out.println("No");
		
	}

}
