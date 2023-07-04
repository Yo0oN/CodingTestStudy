import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] resultArray = new String[15];
        for (int i = 0; i < 5; i++) {
            char[] word = bufferedReader.readLine().toCharArray();
            for (int j = 0; j < word.length; j++) {
                resultArray[j] = resultArray[j] != null ? resultArray[j] + word[j] : String.valueOf(word[j]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] != null) {
                result.append(resultArray[i]);
            }
        }

        bufferedWriter.write(result.toString());
        bufferedWriter.close();
    }
}
