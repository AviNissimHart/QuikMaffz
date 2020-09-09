
public class Calculations {

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
		
	}
	
	public void subtraction(int a, int b) {
		int c = a - b;
		System.out.println(a + "-" + b + "=" + c);
		
	}
	public void mutltiplication(int a, int b) {
		int c = a * b;
		System.out.println(a + "x" + b + "=" + c);
	
	}

	public void division(int a, int b) {
		if (a > b) {
			int c = a / b;
			System.out.println(a + "/" + b + "=" + c);
		} else if (b==0) {
			System.out.println("Warning");
		} else {
			System.out.println("Warning");
		}
	
	}
	public void modulo(int a, int b) {
		int c = a % b;
		System.out.println(a + "%" + b + "=" + c);
		
	}
	public void indices(int a, int b) {
		
	}
	
}
