import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder(bufferedReader.readLine());
        String bomb = bufferedReader.readLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));

            if (result.length() >= bomb.length()) {
                // result의 길이가 폭탄과 같아짐 + 값이 새로 들어올때부터 확인하기 때문에 끝에서부터 폭탄길이만큼만 확인해도된다.
                if (result.substring(result.length() - bomb.length(), result.length()).equals(bomb)) {
                    result.delete(result.length() - bomb.length(), result.length());
                }
            }
        }
        if (result.toString().equals("")) {
            result = new StringBuilder("FRULA");
        }

        bufferedWriter.write(result.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
