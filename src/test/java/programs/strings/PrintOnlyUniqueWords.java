package programs.strings;

import java.util.HashSet;

public class PrintOnlyUniqueWords {

	public static void main(String[] args) {
		String s = "karthik is is a good good boy";
		String[] str = s.split(" ");
		//create a set collection and add all the characters of the given string
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);			
		}
			
		//compare each characters of the given string
		for(String word:set) {
			int count=0;
			for(int i=0; i<str.length; i++){
				//If it is matching increment the count variable
				if(word.equals(str[i])) {
					count++;
				}
			}
		//print both the String and count
			if(count==1) {
			System.out.println("String is = "+word +" and the "+"no. of occurence is = "+count);
			}

		}

	}

}
