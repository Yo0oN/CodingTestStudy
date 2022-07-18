import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        HashSet<String> set = new HashSet<>();
        for (int x = 0; x < N; x++) {
            set.add(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(reader.readLine());
        int result = 0;
        for (int x = 0; x < M; x++) {
            String t = tokenizer.nextToken();
            if (set.contains(t)) {
                set.remove(t);
            } else {
                result++;
            }
        }

        result += set.size();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}