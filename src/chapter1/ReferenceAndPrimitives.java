package chapter1;

public class ReferenceAndPrimitives {
	
//	long max = 312345678987; // DOES NOT COMPILE due to being out of range
//	long max2 = 312345678987L; // Now java know it is a long
//	
//	
//	int value = null; // DOES NOT COMPILE primitive variables cannot be null
//	String s = null;
//	
//	String reference = "hello";
//	int len = reference.length();
//	int bad = len.length(); // DOES NOT COMPILE, primitives do not have methods
	
	public int test() {
		Integer i;
		int y=10;
		int o;
		int t=y+o;
		return t;
		
	}
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
		onlyOneBranch = 1;
		answer = 1;
		} else {
		answer = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch); // DOES NOT COMPILE
		}
}
