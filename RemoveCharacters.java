package NumberofCharcter;

public class RemoveCharacters {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="  Core Java jsp servlets             jdbc struts hibernate spring  ";
		String newstr = str.replaceAll("\\s", "");
		System.out.println(newstr);
	
		char[] arr = str.toCharArray();
		StringBuffer sb =new StringBuffer();
		for(int i=0;i<arr.length-1;i++){
			if((arr[i] != ' ') && (arr[i] != '\t'))
			{
				sb.append(arr[i]);
			}
			
		}
		System.out.println(sb);
	}
	
	

}
