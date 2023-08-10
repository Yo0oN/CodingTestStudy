import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        LinkedList<Integer> queuestack = new LinkedList<>();

        StringTokenizer isQueueOrStack = new StringTokenizer(bufferedReader.readLine());
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            int insert = Integer.parseInt(line.nextToken());
            if (Integer.parseInt(isQueueOrStack.nextToken()) == 0) { // stack일때는 넣으려는 수 그대로 가기 때문에 확인 안함
                queuestack.add(insert);
            }
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        line = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < M; i++) { // 마지막 queue에서 빠지는 값이 나오게되어있음
            int insert = Integer.parseInt(line.nextToken()); // 처음 넣는 값은 제일 앞으로 들어가고, 마지막 queue의 값이 나오게되어있음
            queuestack.addFirst(insert);
            bufferedWriter.write(queuestack.pollLast() + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
