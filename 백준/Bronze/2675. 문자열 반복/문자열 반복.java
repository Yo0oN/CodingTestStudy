import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(bufferedReader.readLine()); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int R = Integer.parseInt(st.nextToken()); // 반복
            char[] S = st.nextToken().toCharArray(); // 입력받은 문자열

            String result = "";
            for (char s : S) {
                result += String.valueOf(s).repeat(R);
            }
            bufferedWriter.write(result + "\n"); // 출력
        }
        bufferedWriter.close();
    }
}
