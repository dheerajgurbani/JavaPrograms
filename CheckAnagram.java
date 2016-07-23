package NumberofCharcter;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "evil";
		String word1 = "vila";
		
		char[] arr = word.toCharArray();
		char[] arr1 = word.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		if(Arrays.equals(arr, arr1))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
