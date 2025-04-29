import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double km;
	    Scanner input = new Scanner(System.in);
	    System.out.println(" enter no. of kilometer");
	    km = input.nextInt();
	    double mile = km*1.6;
	    System.out.println(" no. of miles is" +mile);
	}
}