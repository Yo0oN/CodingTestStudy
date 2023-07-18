import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[5];
        int avr = 0;
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers[i] = number;
            avr += number;
        }
        Arrays.sort(numbers);
        int result1 = avr / 5;
        System.out.println(result1);
        System.out.println(numbers[2]);
    }
}
