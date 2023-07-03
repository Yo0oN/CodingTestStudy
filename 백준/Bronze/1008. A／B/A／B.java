import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
        double result = (double)Integer.parseInt(s[0]) / (double)Integer.parseInt(s[1]);
		System.out.println(result);
	}

}
