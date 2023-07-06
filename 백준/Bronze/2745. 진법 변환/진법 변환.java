import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

        String N = line.nextToken();
        int B = Integer.parseInt(line.nextToken());

        System.out.println(Integer.parseInt(N,B));
    }
}
