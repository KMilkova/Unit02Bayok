package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		double a,b,c;
		double result=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Vvedite a,b,c");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		result = Math.pow(a, 2)- Math.pow((b-c), 2)+Math.log(Math.pow(b, 2)+1);

		System.out.print(result);
	}
}
