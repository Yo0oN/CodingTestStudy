import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = bufferedReader.readLine();

        int result = 0;
        for (int i = 0; i < croa.length; i++) {
            String tmp = word.replaceAll(" ", "");
            int before = tmp.length();

            word = word.replaceAll(croa[i], " ".repeat(croa[i].length()));

            tmp = word.replaceAll(" ", "");
            int after = tmp.length();

            result += (before - after) / croa[i].length();
        }
        word = word.replaceAll(" ", "");

        result += word.length();
        System.out.println(result);
    }
}
