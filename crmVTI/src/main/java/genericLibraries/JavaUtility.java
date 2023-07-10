package genericLibraries;

import java.util.Random;

public class JavaUtility {

	public int generatingRandomNumber(int range) {
		Random random= new Random();
		return random.nextInt(range);
	}
}
