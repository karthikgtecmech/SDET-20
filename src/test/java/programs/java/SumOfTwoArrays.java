package programs.java;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		
		System.out.println(":::Case 1 :::");
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		
		for(int i=0;i<a.length;i++) {
			if(a.length==b.length) {
				int sum = a[i]+b[i];
				System.out.println(sum);
			}
		}	
		
		//case:: 2
		System.out.println(":::Case 2 :::");
		int c[] = {1,2,3,4};
		int d[] = {4,5,6,1,3};
		
		int count = c.length;
		if(count<d.length) {
			count = d.length;
		}
		for(int i=0;i<count;i++) /*{
			if(c.length==d.length) {
				int sum = c[i]+d[i];
				System.out.println(sum);
			}else if(c.length>=d.length) {*/
				try {
					System.out.println(c[i]+d[i]);
				}catch (Exception e) {
					if(c.length>d.length) {
						System.out.println(c[i]);
					}else{
						System.out.println(d[i]);
					}
				}
			/*}else if(c.length<d.length) {
				try {
					System.out.println(c[i]+d[i]);
				}catch (Exception e) {
					System.out.println(d[i]);
				}
			}*/		
	}
}
