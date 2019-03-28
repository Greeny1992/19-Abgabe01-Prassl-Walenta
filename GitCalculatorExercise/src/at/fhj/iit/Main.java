package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		calc.addValue(2);
		calc.addValue(5);
		calc.addValue(4);
		calc.addValue(99);
		calc.addValue(-1);
		System.out.println("The smallest number is: " + calc.getMinimum());
		System.out.println("The largest number is: " + calc.getMaximum());
		System.out.println("The sum of all numbers is: " + calc.sum());
	}
}
