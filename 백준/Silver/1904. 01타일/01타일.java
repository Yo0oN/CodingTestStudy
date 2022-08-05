import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        // 1. 배열 생성
        int[] dp = new int[1000001];
        // 2. 초기화
        dp[1] = 1;
        dp[2] = 2;
        // 3. 점화식 기반 계산값 적용
        for (int index = 3; index < N + 1; index++) {
            dp[index] = (dp[index - 1] + dp[index - 2]) % 15746;
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(dp[N]));
        writer.flush();
        writer.close();
    }
}
