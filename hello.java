import java.io.*;
import java.util.Scanner;
public class hello{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
		System.out.println(payment);
	}
}
