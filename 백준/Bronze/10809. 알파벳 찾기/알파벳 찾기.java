import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String S = bufferedReader.readLine();
        for (int i = 97; i <= 122; i++) {
            bufferedWriter.write(S.indexOf(i) + " ");
        }
        bufferedWriter.close();
    }
}
