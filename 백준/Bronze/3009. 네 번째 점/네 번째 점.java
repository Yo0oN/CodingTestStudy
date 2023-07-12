import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer points = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(points.nextToken());
            int y = Integer.parseInt(points.nextToken());
            if (xSet.contains(x)) {
                xSet.remove(x);
            } else {
                xSet.add(x);
            }
            if (ySet.contains(y)) {
                ySet.remove(y);
            } else {
                ySet.add(y);
            }
        }

        int resultX = xSet.iterator().next();
        int resultY = ySet.iterator().next();

        System.out.println(resultX + " " + resultY);
    }
}
