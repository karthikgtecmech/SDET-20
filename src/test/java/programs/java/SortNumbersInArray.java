package programs.java;

public class SortNumbersInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,0,0,4,0,5,0,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]==0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
			}
			System.out.print(a[i]+" ");
		}
	}

}
