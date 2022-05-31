
public class Calculator {
	public int add(int a, int b) {
		int total = a + b;
		if(total >= 0 && a <= 9999 && a > 0 && b <= 9999 && b > 0 ) {
			return total;
		}
		else {
			return 0;
		}
		
	}
	
	public int subtract(int a, int b) {
		int total = a - b;
		if(total >= 0 && a <= 9999 && a > 0 && b <= 9999 && b > 0 ) {
			return total;
		}
		else {
			return 0;
		}
	}
	
	public int multiply(int a, int b) {
		int total = a * b;
		if(total >= 0 && a <= 9999 && a > 0 && b <= 9999 && b > 0 ) {
			return total;
		}
		else {
			return 0;
		}
	}
	
	public int divide(int a, int b) {
		int total = a / b;
		if(total > 0 && a <= 9999 && a > 0 && b <= 9999 && b > 0 ) {
			return total;
		}
		return 0;
	}
}
