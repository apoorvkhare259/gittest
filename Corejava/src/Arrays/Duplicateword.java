package Arrays;

import java.util.HashMap;
import java.util.Set;

public class Duplicateword {
	
	
	static void duplicateword(String str) {
		
		
		String [] words = str.split(" ");
		
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		
		for (String word : words) {
			
			if(wordcount.containsKey(word.toLowerCase())) {
			
			wordcount.put(word.toLowerCase(), wordcount.get(word.toLowerCase())+1);
			
			}else {
				
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
			
		
		
		
	

public static void main(String[] args)
{
    duplicateword("Bread butter and bread");

    duplicateword("Java is java again java");

    duplicateword("Super Man Bat Man Spider Man");
}
}