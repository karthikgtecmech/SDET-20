package programs.arrays;

public class EqualsOperator {

	public static void main(String[] args) {
		
		String s1="KARTHIK";
		String s2="Karthik";
		
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		

	}

}
