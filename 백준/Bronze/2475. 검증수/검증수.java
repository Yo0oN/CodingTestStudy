import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

		int all = 0;
		for (int i = 0; i < 5; i++) {
			int a = Integer.parseInt(line.nextToken());
			all += (a * a);
		}
		int result = all % 10;

		System.out.println(result);
	}
}