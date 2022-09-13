import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int examLen = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int[] exam = new int[examLen];
        for (int x = 0; x < examLen; x++) {
            exam[x] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(exam);

        int maximum = exam[examLen - 1];
        float result = 0;
        for (int x = 0; x < examLen; x++) {
            result += (double) exam[x] / maximum * 100;
        }
        result = result / examLen;

        System.out.println(result);
    }
}
