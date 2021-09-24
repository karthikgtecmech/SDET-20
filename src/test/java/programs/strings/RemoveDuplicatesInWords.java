package programs.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInWords {

	public static void main(String[] args) {
		String s = "karthik is is a good good boy";
		String[] str = s.split(" ");

		
		//create a LinkedHashSet collection to maintain insertion and add all the characters of the given string
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);			
		}		
		
			//print the character 
			for(String word: set)
			System.out.print(word+" ");

	}

}
