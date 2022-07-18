import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        HashSet<String> set = new HashSet<>();
        for (int x = 0; x < N; x++) {
            set.add(reader.readLine());
        }

        int result = 0;
        for (int x = 0; x < M; x++) {
            if (set.contains(reader.readLine())) {
                result++;
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}