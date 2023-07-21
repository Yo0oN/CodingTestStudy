import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bufferedReader.readLine());
        Set<String> people = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            String name = line.nextToken();
            String log = line.nextToken();
            if (log.equals("enter")) {
                people.add(name);
            } else {
                people.remove(name);
            }
        }
        String[] peopleNowInCompany = people.toArray(new String[people.size()]);
        Arrays.sort(peopleNowInCompany);
        for (int i = peopleNowInCompany.length - 1; i >= 0; i--) {
            bufferedWriter.write(peopleNowInCompany[i] + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
