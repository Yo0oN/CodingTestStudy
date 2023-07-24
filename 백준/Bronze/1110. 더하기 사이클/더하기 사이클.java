import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int origin = Integer.parseInt(bufferedReader.readLine());

        int now = origin;
        int result = 0;
        do {
            int first = now / 10;
            int second = now % 10;

            int plus = first + second;

            int change = (second * 10) + (plus % 10);

            now = change;
            result++;
        } while (now != origin);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
