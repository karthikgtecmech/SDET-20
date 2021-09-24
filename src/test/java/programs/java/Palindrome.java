package programs.java;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int pal = 141;
		int temp = pal;
		int rev = 0;
		for(int i=0; pal>0; i++) {
			
			 int rem = pal%10;
			 rev = rev*10 + rem;
			 pal = pal/10;
			 System.out.println(rev);
		}
	
		if(temp==rev) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
		
	}

}
