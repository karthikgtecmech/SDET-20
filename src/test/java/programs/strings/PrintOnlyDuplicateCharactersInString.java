package programs.strings;

import java.util.HashSet;

public class PrintOnlyDuplicateCharactersInString {

	public static void main(String[] args) {
		String s = "karthik";
		//create a set collection and add all the characters of the given string
		HashSet<Character> set = new HashSet<Character>();
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
			//print both the character and count
			if(count>1) {
			System.out.println("Duplicates in the given string is = "+ch +"  "+"no. of occurence is = "+count);
			}
		}

	}

}
