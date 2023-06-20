import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine()); // 시험장 개수
        StringTokenizer A = new StringTokenizer(bufferedReader.readLine()); // 각 시험장에 있는 응시자의 수
        StringTokenizer BC = new StringTokenizer(bufferedReader.readLine());
        int B = Integer.parseInt(BC.nextToken()); // 총감독관이 감독할 수 있는 응시자 수
        int C = Integer.parseInt(BC.nextToken()); // 부감독관이 감독할 수 있는 응시자 수

        long result = 0;
        for (int i = 0; i < N; i++) {
            int numberOfPeople = Integer.parseInt(A.nextToken());
            int leftNumberOfPeople = numberOfPeople - B;
            // 총감독관 추가
            result++;
            if (leftNumberOfPeople <= 0) {
                continue;
            }
            // 부감독관 추가
            result += (leftNumberOfPeople % C) > 0 ? leftNumberOfPeople / C + 1 : leftNumberOfPeople / C;
        }

        System.out.println(result);
    }
}
