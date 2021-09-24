package programs.java;

public class Prime {

	public static void main(String[] args) {
		
		int num = 11;
		int i =2;
		boolean isPrime = true;
		
		while(i<=num/2) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
