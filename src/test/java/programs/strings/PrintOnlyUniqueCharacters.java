package programs.strings;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		String s = "karthik";
		//create a LinkedHashSet collection to maintain insertion and add all the characters of the given string
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));			
		}
			
		//compare each characters of the given string
		for(Character ch:set) {
			int count=0;
			for(int i=0; i<s.length(); i++){
				//If it is matching increment the count variable
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			//print the character 
			if(count==1) {
			System.out.print(ch);
			}
		}
	}

}
