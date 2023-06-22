import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer meta = new StringTokenizer(bufferedReader.readLine()); // 지도 크기, 주사위 위치, 명령 수

        int N = Integer.parseInt(meta.nextToken()); // 세로 크기
        int M = Integer.parseInt(meta.nextToken()); // 가로 크기
        int[][] map = new int[N][M]; // 지도

        int x = Integer.parseInt(meta.nextToken()); // 주사위의 현재 x 좌표
        int y = Integer.parseInt(meta.nextToken()); // 주사위의 현재 y 좌표

        int K = Integer.parseInt(meta.nextToken()); // 명령의 개수

        for (int i = 0; i < N; i++) {
            StringTokenizer mapNumber = new StringTokenizer(bufferedReader.readLine()); // 지도에 적힌 값
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(mapNumber.nextToken());
            }
        }

        int[] dice = new int[6];
        int nowBottom = 0;
        StringTokenizer orders = new StringTokenizer(bufferedReader.readLine()); // 명령

        for (int i = 0; i < K; i++) {
            int order = Integer.parseInt(orders.nextToken());

            // 지도 밖을 벗어나려하면 다음명령으로
            if (order == 1 && y >= M - 1) {
                continue;
            }
            if (order == 2 && y <= 0) {
                continue;
            }
            if (order == 3 && x <= 0) {
                continue;
            }
            if (order == 4 && x >= N - 1) {
                continue;
            }

            // 1. 옮겨진 이후의 주사위 값 구하기
            // 조건 1. 주사위의 바닥면은 무조건 인덱스 0이고, 주사위의 윗면은 인덱스 1이다.
            // 조건 2. 주사위의 바닥 기준 남쪽을 향한 옆면의 인덱스는 2이고, 북쪽을 향한 옆면의 인덱스는 3이다.
            // 조건 3. 주사위의 바닥 기준 동쪽을 향한 옆면의 인덱스는 4이고, 서쪽을 향한 옆면의 인덱스는 5이다.
            switch (order) {
                case 1 : // 동
                    y++;
                    nowBottom = dice[4]; // 옮겨진 이후의 바닥면(기존 동쪽면)
                    dice[4] = dice[1]; // 기존 윗면이 동쪽면
                    dice[1] = dice[5]; // 기존 서쪽면이 윗면
                    dice[5] = dice[0]; // 기존 바닥면이 서쪽면
                    dice[0] = nowBottom; // 기존 동쪽면이 바닥면
                    // 나머지 두 면은 변하지 않음
                    break;
                case 2 : // 서
                    y--;
                    nowBottom = dice[5]; // 옮겨진 이후의 바닥면(기존 서쪽면)
                    dice[5] = dice[1]; // 기존 윗면이 서쪽면
                    dice[1] = dice[4]; // 기존 동쪽면이 윗면
                    dice[4] = dice[0]; // 기존 바닥면이 동쪽면
                    dice[0] = nowBottom; // 기존 서쪽면이 바닥면
                    // 나머지 두 면은 변하지 않음
                    break;
                case 3 : // 북
                    x--;
                    nowBottom = dice[3]; // 옮겨진 이후의 바닥면(기존 북쪽면)
                    dice[3] = dice[1]; // 기존 윗면이 북쪽면
                    dice[1] = dice[2]; // 기존 남쪽면이 윗면
                    dice[2] = dice[0]; // 기존 바닥면이 남쪽면
                    dice[0] = nowBottom; // 기존 북쪽면이 바닥면
                    // 나머지 두 면은 변하지 않음
                    break;
                case 4 : // 남
                    x++;
                    nowBottom = dice[2]; // 옮겨진 이후의 바닥면(기존 남쪽면)
                    dice[2] = dice[1]; // 기존 윗면이 남쪽면
                    dice[1] = dice[3]; // 기존 북쪽면이 윗면
                    dice[3] = dice[0]; // 기존 바닥면이 북쪽면
                    dice[0] = nowBottom; // 기존 남쪽면이 바닥면
                    // 나머지 두 면은 변하지 않음
                    break;
            }

            // 2. 지도의 값이 1 이상이면 0으로 변경하고 바닥면에 지도의 값을 넣기
            if (map[x][y] > 0) {
                dice[0] = map[x][y];
                map[x][y] = 0;
            } else { // 지도의 값이 0이라면 옮겨진 바닥면의 값을 지도에 넣기
                map[x][y] = dice[0];
            }

            // 3. 주사위 윗면의 값 출력
            bufferedWriter.write(dice[1] + "\n");
        }
        bufferedWriter.close();
    }
}
