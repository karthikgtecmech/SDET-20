package vtiger;

import java.util.Random;

import com.vtiger.com_generic_utility.JavaUtility;

public class Practice2 {
	public int getRandomNumber(){
		int random = new Random().nextInt(1000);
		System.out.println(random);
		return random;
	}
public static void main(String[] args) {
	Practice2 p = new Practice2();
	p.getRandomNumber();
	JavaUtility ju = new JavaUtility();
	System.out.println(ju.getSystemDate());
	System.out.println(ju.getSystemDateYYYYMMDD());
}
}
