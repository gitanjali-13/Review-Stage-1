import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int num = 0;
		System.out.println(" Find factorial number of given input : ");
		System.out.println("Enter the element : ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(" Given numbers : " +num );
			for (int i = 0; i <=num; i++ )
			{
				if (num % 1 == 0 )
					System.out.println( i + " " );
				
			}
			System.out.println(" Factorial of the given number :"  );
		}

}
