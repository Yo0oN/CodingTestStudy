import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(bufferedReader.readLine()); // 테스트 케이스 개수

        for (int i = 1; i <= T; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);

            String result = String.format("Case #%d: %d\n", i, sum);
            bufferedWriter.write(result);
        }

        bufferedWriter.close();
    }
}
