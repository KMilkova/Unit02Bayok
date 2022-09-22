package It.Ihu.unit02.main;

import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		int sum = 0;
		
		System.out.println("Vvedite a,b");		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		sum = a + b;
		
		System.out.print("sum = "+ sum);
	}
}
