import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        int xy[][] = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            xy[i][0] = Integer.parseInt(line.nextToken());
            xy[i][1] = Integer.parseInt(line.nextToken());
        }

        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) { // 첫번째 매개변수가 두번째보다 크다면 양수, 같다면 0, 작다면 음수
                if(o1[0] == o2[0]) { // x가 같을 경우 y 비교
                    return o1[1] - o2[1];
                }
                else { // x가 다른경우 더 큰 수 출력
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bufferedWriter.write(xy[i][0] + " " + xy[i][1] + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
