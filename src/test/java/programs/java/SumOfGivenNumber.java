package programs.java;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		
		int n = 7895991;
		
		while(n>9) {
			int sum = 0;
			while(n>0) {
			int mod = n%10;
			sum = sum+mod;
			n = n/10;			
		}
			n = sum;
		}
		
		System.out.println(n);
	}

}
