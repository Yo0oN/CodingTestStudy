import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        if (N == 1) {
            return;
        }

        int i = 2;
        while (N > 1) {
            while (N % i == 0 && N > 1) {
                N /= i;
                System.out.println(i);
            }
            i++;
        }
    }
}
