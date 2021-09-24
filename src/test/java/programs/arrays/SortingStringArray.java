package programs.arrays;

public class SortingStringArray {

	public static void main(String[] args) {
		
		String s[] = {"apple", "mango", "banana", "orange"};
		
		//1. Based on length
		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].length() > s[j].length()) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;					
				}
			}
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);			
		}
		
		//2. Based on Alphanumeric (Refer compareTo method)
		
		String a[] = {"abc", "ab", "abeadc", "abccde"};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i].compareTo(a[j])>0) {
					String temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}
			}	
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);			
		}		
	}

}
