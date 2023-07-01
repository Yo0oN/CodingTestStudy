import java.io.*;
import java.util.Arrays;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String word = bufferedReader.readLine();
        char[] letters = word.toUpperCase().toCharArray();
        Arrays.sort(letters);

        word = new String(letters);
        int count = 0;
        String result = "";
        while(word.length() > 0) {
            String letter = String.valueOf(word.charAt(0));

            int before = word.length();
            word = word.replaceAll(letter, "");
            int after = word.length();

            if (before - after > count) {
                result = letter;
                count = before - after;
            } else if (before - after == count) {
                result = "?";
            }
        }
        bufferedWriter.write(result);
        bufferedWriter.close();
    }
}
