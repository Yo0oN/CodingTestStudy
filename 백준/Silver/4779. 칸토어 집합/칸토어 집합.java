import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String input;
        while ((input = bufferedReader.readLine()) != null) {
            int N = Integer.parseInt(input);

            double threeN = Math.pow(3, N);
            StringBuilder s = new StringBuilder();
            while (threeN > 0) {
                s.append("-");
                threeN--;
            }
            String result = 재귀(s.toString());
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String 재귀(String s) {
        if (s.length() == 1) {
            return s;
        }
        int cut = s.length() / 3;
        StringBuilder merge = new StringBuilder();
        merge.append(재귀(s.substring(0, cut)));
        for (int i = 0; i < cut; i++) {
            merge.append(" ");
        }
        merge.append(재귀(s.substring(cut * 2, s.length())));

        return merge.toString();
    }
}
