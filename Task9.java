package test;
import static java.lang.Math.*;

public class Task9 {
	
	static int add(Integer a, Integer b) { return addExact(a, b); }
	static int subtract(Integer a, Integer b) { return subtractExact(a, b); }
	static int multiply(Integer a, Integer b) { return multiplyExact(a, b); }
	static float divide(Integer a, Integer b) { return  (float) floorDiv(a, b); }

	public static void main(String[] args) {
		System.out.println("add.input(1, 2): " + Task9.add(1, 2));
		System.out.println("subtract.input(1, 2): " + Task9.subtract(1, 2));
		System.out.println("multiply.input(1, 2): " + Task9.multiply(1, 2));
		System.out.println("divide.input(1, 2): " + Task9.divide(1, 2));
	}
}
