package programs.arrays;

public class MinLengthString {

	public static void main(String[] args) {
		
		String s[] = {"Hibro","Karthik","Java","Eclipse"};
		
		String min = s[0];
		
		for(int i=0;i<s.length;i++) {
			if(min.length()>s[i].length()) {
				
				min = s[i];
			}
			
		}
		System.out.println(min);

	}

}
