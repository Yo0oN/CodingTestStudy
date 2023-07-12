import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(line.nextToken());
        int b = Integer.parseInt(line.nextToken());
        int c = Integer.parseInt(line.nextToken());

        int[] sort = {a, b, c};
        Arrays.sort(sort);

        if (sort[0] + sort[1] <= sort[2]) {
            sort[2] = sort[0] + sort[1] - 1;
        }
        int result = sort[0] + sort[1] + sort[2];

        System.out.println(result);
    }
}
