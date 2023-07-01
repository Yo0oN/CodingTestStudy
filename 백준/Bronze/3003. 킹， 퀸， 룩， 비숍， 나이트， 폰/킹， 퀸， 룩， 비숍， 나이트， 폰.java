import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer pieces = new StringTokenizer(bufferedReader.readLine());

        int[] allPieces = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int piece = Integer.parseInt(pieces.nextToken());

            bufferedWriter.write(allPieces[i] - piece + " ");
        }
        bufferedWriter.close();
    }
}
