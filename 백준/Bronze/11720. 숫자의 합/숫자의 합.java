import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine()); // 숫자개수
        char[] numbers = bufferedReader.readLine().toCharArray(); // 입력된 숫자
        long result = 0;
        for (char number : numbers) {
            result += Integer.parseInt(String.valueOf(number));
        }

        System.out.print(result);
    }
}
