import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String S = bufferedReader.readLine();

        Set<String> partS = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                partS.add(S.substring(i, j));
            }
        }

        bufferedWriter.write(String.valueOf(partS.size()));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
