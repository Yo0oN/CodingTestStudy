import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] stars = new String[N];
        for(int i = 1; i <= ((2 * N) - 1); i++) {
            if (i <= N) {
                String star = " ".repeat(N - i) + "*".repeat((i * 2) - 1);
                stars[i - 1] = star;
                bufferedWriter.write(star + "\n");
            }
        }
        for(int i = N - 2; i >= 0; i--) {
            bufferedWriter.write(stars[i] + "\n");
        }
        bufferedWriter.close();
    }
}
