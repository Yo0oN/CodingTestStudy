import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 1. 입력값 + 1 크기의 배열 생성
        // 2. 5번 삼각형까지는 규칙이 없다. 배열의 5번까지 초기값 설정하기
        // 3. 점화식 기반으로 계산값 적용하기 > P(N) = P(N - 1) + P(N - 5)
        // 4. 특정 입려값에 따른 계산값을 리스트에서 추출

        int T = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < T; x++) {
            int N = Integer.parseInt(reader.readLine());
            // 1. 배열 생성 >  ArrayIndexOutOfBounds로 입력값의 최댓값으로 고정
            long[] dp = new long[101];
            // 2. 초기화
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;
            // 3. 점화식 기반 계산값 적용
            for (int index = 6; index < N + 1; index++) {
                dp[index] = dp[index - 1] + dp[index - 5];
            }

            // 4. 리스트 추출
            result.append(dp[N]);
            result.append("\n");
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
