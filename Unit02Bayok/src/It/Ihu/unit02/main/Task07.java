package It.Ihu.unit02.main;

public class Task07 {
	
	public static void main(String[] args) {
		double a = 4.6;
		double b = 5.2;
		double c = -3.0;
		
		
		if (a <  0) {
			a = Math.pow(a, 4);
		}else {
			a = Math.pow(a, 2);
		}
		if (b < 0) {
			b = Math.pow(b, 4);
		}else {
			b = Math.pow(b, 2);
		}
		if (c < 0) {
			c = Math.pow(c, 4);
		}else {
			c = Math.pow(c, 2);
		}
		
		System.out.print("a = " + a + " b = " + b + " c = " + c);
		
	}
}