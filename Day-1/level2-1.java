import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int x;
	    int y;
	    
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first number : ");
	    x = input.nextInt();
		System.out.print("Enter the second number:");
		y = input.nextInt();
		double a = x/y;
		double b = x%y;
		System.out.println("The quotient is " + a +" and the remainder is " + b);
	}
}