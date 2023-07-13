import java.io.*;
import java.util.Arrays;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
