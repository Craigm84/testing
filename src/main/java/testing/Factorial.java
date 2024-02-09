package testing;

public class Factorial {

	public int factorial(int a) {
		int num = 1;
		for (int i = 1; i <= a; i++) {
			num = num * i;
		}
		return num;

	}

	public String revFactorial(double a) {
		for (int i = 1; i <= a; i++) {
			a = a / i;
			if (a == 1) {
				return i + "!";
			}
		}
		return "none";
	}

}
