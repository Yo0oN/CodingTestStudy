import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] arr;
    private static StringBuilder result = new StringBuilder();
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(line.nextToken());
        M = Integer.parseInt(line.nextToken());

        // M개만큼 수열을 뽑아내기 때문에 정답을 담아둘 배열은 M으로 설정
        arr = new int[M];
        dfs(0, 0);

        bufferedWriter.write(result.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void dfs(int start, int depth) { // 트리 탐색하기
        // 트리의 마지막에 도착했다면 중단
        if (depth == M) {
            for (int val : arr) {
                result.append(val);
                result.append(" ");
            }
            result.append("\n");
            return;
        }

        // 중복 탐색이 가능하기 때문에 방문 여부를 확인하지 않는다.
        // 자식노드 하나씩 탐색
        for (int i = start; i < N; i++) {
            // 현재 방문한 노드를 정답배열에 넣기
            arr[depth] = i + 1;
            // 트리의 마지막이 아니기 때문에 자식 노드 다시 탐색
            dfs(i, depth + 1);
        }
    }
}
