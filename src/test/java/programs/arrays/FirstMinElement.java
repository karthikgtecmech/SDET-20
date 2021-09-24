package programs.arrays;

public class FirstMinElement {

	public static void main(String[] args) {
		
		int a[] = {11,27,9,44,39};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i]<a[j]) {								
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					}
				}
			}
			
			System.out.println(a[0]);	
	}

}
