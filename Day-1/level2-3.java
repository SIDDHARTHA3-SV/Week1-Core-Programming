import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double a;
	    double b;
	    double c;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first number : ");
	    a = input.nextDouble();
		System.out.print("Enter the second number:");
		b = input.nextDouble();
		System.out.print("Enter the third number:");
		c = input.nextDouble();
		double x = a + b *c;
		double y = a * b + c;
		double z = c + a / b;
		System.out.println("The first result is " + x +" \n and the second result is " + y +" \n the third result is "+z);
	}
}