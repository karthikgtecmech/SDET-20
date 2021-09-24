package programs.java;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=10;
		int i=0;
		int first=0;
		int second=1;
		
		while(i<=n) {
			System.out.print(first+",");
			int third = first + second;
			first = second;
			second = third;
			i++;
		}

	}

}
