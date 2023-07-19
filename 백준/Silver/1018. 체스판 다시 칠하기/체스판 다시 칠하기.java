import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer NM = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());
        boolean[][] inputChess = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            char[] line = bufferedReader.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                if (line[j] == 'W') {
                    inputChess[i][j] = true;
                } else {
                    inputChess[i][j] = false;
                }
            }
        }

        int result = 64;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                boolean now = inputChess[i][j]; // 첫번째 칸의 색
                int count = 0;
                // 지정한 곳부터 8개 칸의 색을 확인하면서 바르게 색칠되어있는지 확인
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if (inputChess[x][y] != now) {
                            count++;
                        }
                        now = !now; // 다음 칸은 색이 바뀌므로 색 바꾸기
                    }
                    now = !now; // 다음 줄의 첫 칸은 이전 줄의 마지막 칸과 같으므로 색 바꾸기
                }
                // 확인이 끝났으면 작은 값 확인하기
                count = Math.min(count, 64 - count);
                result = Math.min(count, result);
            }
        }
        System.out.println(result);
    }
}