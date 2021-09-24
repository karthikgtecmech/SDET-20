package programs.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse the given string w/o using 3rd variable
		String s = "Karthik";
				
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		//Reverse the given string by using 3rd variable
		String reverse = "";
		                                                                                                                                                                                                                     
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.print(reverse);
		System.out.println();
		
		//Reverse the given string w/o using length()
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c: ch ) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
