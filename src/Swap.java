import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int A = 0;
		
		System.out.println("Swapping two elements.");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value for x : ");
		int X = scan.nextInt();
		
		System.out.println("Enter the value for y : ");
		int Y = scan.nextInt();
		
		A = X;
		X = Y;
		Y = A;
		System.out.println("Swapped elements are :" + " X= " + X + " Y = " + Y );
		
	}

}
