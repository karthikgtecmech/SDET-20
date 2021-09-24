package programs.strings;


import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String s = "karthik";
		
		//create a LinkedHashSet collection to maintain insertion and add all the characters of the given string
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));			
		}			
		
			//print the character 
			for(Character ch: set)
			System.out.print(ch);
	}

}
