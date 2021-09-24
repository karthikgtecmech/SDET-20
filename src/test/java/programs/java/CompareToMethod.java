package programs.java;

public class CompareToMethod {

	public static void main(String[] args) {
		
		String s1 = "ab";
		String s2 = "ab";
		System.out.println("Scenario 1 ::"+s1.compareTo(s2));
	
		String s3 = "ab";
		String s4 = "abc";
		System.out.println("Scenario 2 ::"+s3.compareTo(s4));
		
		String s5 = "abcd";
		String s6 = "ab";
		System.out.println("Scenario 3 ::"+s5.compareTo(s6));

		String s7 = "ab";
		String s8 = "abcd";
		System.out.println("Scenario 4 ::"+s7.compareTo(s8));
	
		String s9 = "karthik";
		String s10 = "";
		System.out.println("Scenario 5 ::"+s9.compareTo(s10));
	}

}
