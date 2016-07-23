package NumberofCharcter;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "House, House, House, Dog, Dog, Dog, Dog";
		HashMap<String, Integer> map = new  HashMap<String, Integer>();
		 
		String[] arr = input.split(",\\s*");
		
		for(int i=0;i<arr.length;i++)
		{
			Integer word = map.get(arr[i]);
			if(map.containsKey(arr[i])){
				map.put(arr[i], word+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		
		
			System.out.println(map);
		
		

	}

}
