package NumberofCharcter;

public class CountCharacters {
	
	static String input = "aabbbbbcccccc";
	//static char[] result;
	static int n = input.length();
	
	static char[] arr = input.toCharArray();
	
	public static void main(String[] args) {

		int count = 1;
		int i=0;
		
		while( i<=n){
			while(arr[i]==arr[i+1]){
				
				count++;
			}
			String result = arr[i]+count+"";
			input = "".concat(result);
		}
		System.out.println(input);
	}

}
