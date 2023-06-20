import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(bufferedReader.readLine()); // 총 금액
        int N = Integer.parseInt(bufferedReader.readLine()); // 구매 물건 수

        int price = 0;
        for (int i = 0; i < N; i++) {
            String[] priceAndCount = bufferedReader.readLine().split(" ");
            price += Integer.parseInt(priceAndCount[0]) * Integer.parseInt(priceAndCount[1]);
        }

        String result = "No";
        if (price == X) {
            result = "Yes";
        }

        bufferedWriter.write(result);
        bufferedWriter.close();
    }
}
