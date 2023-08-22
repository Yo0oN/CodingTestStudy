import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] arr;
    private static boolean[] visit;
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(line.nextToken());
        int M = Integer.parseInt(line.nextToken());

        // M개만큼 수열을 뽑아내기 때문에 정답을 담아둘 배열은 M으로 설정
        arr = new int[M];
        // 각 노드당 1부터 N까지의 자식 노드를 가지고 있기 때문에 방문 여부는 N으로 설정
        visit = new boolean[N];
        dfs(N, M, 0);

        bufferedWriter.write(result.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void dfs(int N, int M, int depth) { // 트리 탐색하기
        // 트리의 마지막에 도착했다면 중단
        if (depth == M) {
            for (int val : arr) {
                result.append(val);
                result.append(" ");
            }
            result.append("\n");
            return;
        }

        // 자식노드 하나씩 탐색
        for (int i = 0; i < N; i++) {
            // 방문하지 않았다면 탐색
            if (!visit[i]) {
                // 탐색할 노드들은 서로 다른 값을 가져야하기 때문에 이전 노드들에서 방문한 값은 탐색하지 않도록 현재 노드는 true로 변경
                visit[i] = true;
                // 현재 방문한 노드를 정답배열에 넣기
                arr[depth] = i + 1;
                // 트리의 마지막이 아니기 때문에 자식 노드 다시 탐색
                dfs(N, M, depth + 1);
                // 자식노드의 탐색이 모두 끝나서 돌아왔기 때문에 방문 여부를 초기화
                visit[i] = false;
            }
        }
    }
}
