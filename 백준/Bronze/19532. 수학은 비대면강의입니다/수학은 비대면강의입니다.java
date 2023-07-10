import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer abcdef = new StringTokenizer(bufferedReader.readLine()); // 지도 크기
        int a = Integer.parseInt(abcdef.nextToken());
        int b = Integer.parseInt(abcdef.nextToken());
        int c = Integer.parseInt(abcdef.nextToken());
        int d = Integer.parseInt(abcdef.nextToken());
        int e = Integer.parseInt(abcdef.nextToken());
        int f = Integer.parseInt(abcdef.nextToken());
        int x = (b * f - c * e) / (b * d - a * e);
        int y = (a * f - d * c) / (a * e - d * b);

        System.out.println(x + " " + y);
    }
}
