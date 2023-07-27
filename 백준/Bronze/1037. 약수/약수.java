import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] yaksu = new int[count];
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < count; i++) {
            yaksu[i] = Integer.parseInt(line.nextToken());
        }
        Arrays.sort(yaksu);
        int result = yaksu[0] * yaksu[yaksu.length - 1];
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
