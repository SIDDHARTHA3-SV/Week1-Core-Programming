import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int salary,bonus;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Salary: ");
		salary = in.nextInt();
		System.out.print("Enter the bonus: ");
		bonus = in.nextInt();
		int result = salary+bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " .Hence Total Income is INR " + result);
	}
}
