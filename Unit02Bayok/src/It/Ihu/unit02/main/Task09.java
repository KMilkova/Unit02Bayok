package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task09 {
	
	public static void main(String[] args) {
		
		System.out.print("Введите x");
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		double fx = 0;
		
		if (x<=-3) {
			fx=9;
			System.out.print("F(x) = " + fx);
		}else if (x>3){
			fx = 1/(Math.pow(x, 2)+1);
			System.out.print("F(x) = " + fx);
		}else {
			System.out.print("При таком х значение ф-ции не вычисляется");
		}
	}
}
