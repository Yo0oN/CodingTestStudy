import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        char[] word = bufferedReader.readLine().toCharArray();

        int result = 1;
        for (int i = 0; i < word.length; i++) {
            if (word[i] != word[word.length - i - 1]) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}
