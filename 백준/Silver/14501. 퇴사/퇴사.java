import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine()); // 퇴사까지 남은 일

        int[] day = new int[N];
        int[] pay = new int[N];
        int[] dp = new int[N + 5]; // +5를 하는 이유?

        for (int i = 0; i < N; i++) {
            StringTokenizer tp = new StringTokenizer(bufferedReader.readLine());
            day[i] = Integer.parseInt(tp.nextToken()); // 상담에 소요되는 시간
            if (i + day[i] > N) { // 상담 소요일이 퇴사일을 넘기면 비용 0
                continue;
            }
            pay[i] = Integer.parseInt(tp.nextToken()); // 상담 비용
        }

        // 마지막날부터 탐색하기
        for(int i = N - 1; i >= 0; i--){
            if (i == N - 1) { // 마지막날이면 그냥 금액 넣기
                dp[i] = pay[i];
            } else if (pay[i] == 0) { // 만약 pay가 0이면(= 상담 소요일이 퇴사일을 넘김) 그냥 금액 넣기
                dp[i] = dp[i + 1];
            } else { // (탐색일에 받는 금액 + 탐색일의 작업 끝나고 이후 받을 수 있는 최대 금액)과 (지금까지 계산된 최대 금액) 비교해서 더 큰거 넣기
                // 탐색일의 작업이 퇴사일에 끝나면 탐색일의 작업 끝나고 이후 받을수있는 금액이 없으므로 0, 퇴사일 전에 끝나면 (탐색일 + 탐색일 작업의 소요시간)
                int afterNowDPIndex = i + day[i] >= N ? 0 : i + day[i];
                dp[i] = Math.max(pay[i] + dp[afterNowDPIndex], dp[i + 1]);
            }
        }

        System.out.print(dp[0]);
    }
}
