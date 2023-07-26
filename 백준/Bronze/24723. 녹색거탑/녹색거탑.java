import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        int result = (int) Math.pow(2, N);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
