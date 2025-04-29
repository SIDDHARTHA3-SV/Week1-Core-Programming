import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a;
	    int b;
	    int c;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first number : ");
	    a = input.nextInt();
		System.out.print("Enter the second number:");
		b = input.nextInt();
		System.out.print("Enter the third number:");
		c = input.nextInt();
		int x = a + b *c;
		int y = a * b + c;
		int z = c + a / b;
		System.out.println("The first result is " + x +" \n and the second result is " + y +" \n the third result is "+z);
	}
}