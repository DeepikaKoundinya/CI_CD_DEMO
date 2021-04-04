package test;

import java.util.Random;

public class randomNumber {
	public static String appendRandom(String base) {
		return base + new Random().nextInt();
	}
	public String appendRandom1(String base) {
		return base + new Random().nextInt();
	}
}
