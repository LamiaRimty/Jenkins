import java.util.Scanner;

public class Main {
	public static void main(String [] arguments) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give First Value\n");
		int a = scanner.nextInt();
		
		System.out.println("Give Second Value\n");
		int b = scanner.nextInt();
		
		System.out.println(a + b);
	}
}
