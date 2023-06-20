import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine()); // N 바이트

        int count = N / 4;
        for (int i = 0; i < count; i++) {
            bufferedWriter.write("long ");
        }
        bufferedWriter.write("int");
        bufferedWriter.close();
    }
}
