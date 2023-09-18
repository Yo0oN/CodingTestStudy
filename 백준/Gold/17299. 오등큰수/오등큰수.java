import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer As = new StringTokenizer(bufferedReader.readLine());

        int[] AsList = new int[N]; // 입력된 숫자
        int[] count = new int[1000001];
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(As.nextToken());
            AsList[i] = A;
            count[A]++;
        }

        Stack<Integer> AsStack = new Stack<>(); // 인덱스가 들어갈 스택
        for (int i = 0; i < N; i++) {
            int A = AsList[i];

            // 현재 값의 F값과 스택에 있는 기존 F값들을 비교
            while (!AsStack.isEmpty() && count[A] > count[AsList[AsStack.peek()]]) {
                // 만약 스택에 들어간 이전 F값들이 현재 값의 F값보다 크다면 해당 수가 왼쪽의 수보다 오른편에 있으면서 가장 첫번째 F값이 큰 수가 된다.
                // 스택에서 빼고, 정답을 넣어줌
                AsList[AsStack.pop()] = A;
            }
            // 그리고 현재 값은 이후 나올 값들과 비교해야하니 스택에 추가
            AsStack.add(i);
        }

        // 반복문을 다 돌렸음에도 스택에 있는 값들은 오등큰수가 없는것
        while(!AsStack.isEmpty()) {
            AsList[AsStack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            bufferedWriter.write(String.valueOf(AsList[i]));
            bufferedWriter.write(" ");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
