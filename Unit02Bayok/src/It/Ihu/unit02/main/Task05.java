package It.Ihu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a = 2.0;
		double b = 4.0;
		double c = 3.0;
		
		double result = 0;
		result = (b+Math.sqrt(Math.pow(b, 2)+4.0*a*c))/(2*a) - Math.pow(a, 3)*c+b;
				
		System.out.print(result);
		
	}
}
