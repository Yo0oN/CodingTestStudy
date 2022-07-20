import java.util.Scanner;

// 재귀함수를 이용하여 팩토리얼을 구하여라.
public class Main {
	public int factorial(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Main q10872 = new Main();
		System.out.println(q10872.factorial(num));
	}

}
