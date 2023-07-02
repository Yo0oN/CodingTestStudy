import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double allScore = 0;
        double allGrade = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            st.nextToken();
            double score = Float.parseFloat(st.nextToken());
            String hak = st.nextToken();

            if (hak.equals("P")) {
                continue;
            }

            allScore += score * map.get(hak);
            allGrade += score;
        }
        double result = allScore / allGrade;
        System.out.println(result);
    }
}
