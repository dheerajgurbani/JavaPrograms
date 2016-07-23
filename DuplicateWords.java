package NumberofCharcter;

import java.util.HashMap;
import java.util.*;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="I am very very good boy";
		
		String[] inputarr = input.split(" ");
		
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		
		for(String word : inputarr){
			if(wordcount.containsKey(word.toLowerCase())){
				wordcount.put(word, wordcount.get(word.toLowerCase()+1));
			}
			else{
				wordcount.put(word.toLowerCase(), 1);
			}
		}

		Set<String> wordsInString = wordcount.keySet();
		 
        //Iterating through all words in wordCount
 
        for (String word : wordsInString)
        {
            //if word count is greater than 1
 
            if(wordcount.get(word) > 1)
            {
                //Printing that word and it's count
 
                System.out.println(word+" : "+wordcount.get(word));
            }
        }
	}
	
	

}
