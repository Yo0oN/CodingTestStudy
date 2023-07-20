import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        Set<Integer> numbers = new HashSet<>();

        StringTokenizer Ns = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(Ns.nextToken()));
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer Ms = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < M; i++) {
            if (numbers.contains(Integer.parseInt(Ms.nextToken()))) {
                bufferedWriter.write(1 + " ");
            } else {
                bufferedWriter.write(0 + " ");
            }
        }
        bufferedWriter.close();
    }
}
