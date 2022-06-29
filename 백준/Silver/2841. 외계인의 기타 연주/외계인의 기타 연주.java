import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] NP = reader.readLine().split(" ");
        int N = Integer.parseInt(NP[0]); // 입력될 개수
        int P = Integer.parseInt(NP[1]); // 프랫 수

        Stack<Integer>[] finger = new Stack[6]; // 6개의 줄
        for (int x = 0; x < 6; x++) {
            finger[x] = new Stack<Integer>();
        }

        int result = 0;
        for (int x = 0; x < N; x++) {
            String[] melody = reader.readLine().split(" ");
            int line = Integer.parseInt(melody[0]) - 1;
            int pret = Integer.parseInt(melody[1]);

            // 선택된 줄에 손가락이 있고, 프랫이 더 작으면 손가락 떼기
            while (!finger[line].isEmpty() && finger[line].peek() > pret) {
                finger[line].pop();
                result++;
            }
            // 선택된 줄에 손가락이 없다면 넣기 또는 프랫이 이전보다 크다면 넣기
            if (finger[line].isEmpty() || finger[line].peek() < pret) {
                finger[line].add(pret);
                result++;
            }
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}
