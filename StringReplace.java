/*Moo foo Soo book
*/
package NumberofCharcter;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Moo foo Soo boooook";
		StringBuilder sb = new StringBuilder();
		char[] arr = input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='o' && i<arr.length-1 && arr[i]==arr[i+1]){
				{
					sb.append(arr[i]);
					i++;
				}
			}
				else{
					sb.append(input.charAt(i));
				}
			
			
		}
		System.out.println(sb);
	}

}
