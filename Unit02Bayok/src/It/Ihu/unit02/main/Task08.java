package It.Ihu.unit02.main;

public class Task08 {
	
	public static void main(String[] args) {
		double a = 0.0;
		double b = 15.0;
		double h = 3.0;
		double fx = 0.0;
		
		System.out.println("x\tf(x)");

		
		for	(double x = a; x<=b;x+=h) {
			fx = 2*Math.tan(x/2)+1;
			System.out.println(x + "\t" + fx);
		}
	}
}
