import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bufferedReader.readLine());
        Map<Integer, Integer> cards = new HashMap<>();
        StringTokenizer nowHavingCards = new StringTokenizer(bufferedReader.readLine());
        while (nowHavingCards.hasMoreTokens()) {
            int nowCard = Integer.parseInt(nowHavingCards.nextToken());
            cards.put(nowCard, (cards.getOrDefault(nowCard, 0) + 1));
        }

        int m = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer wantCards = new StringTokenizer(bufferedReader.readLine());
        while (wantCards.hasMoreTokens()) {
            int wantCard = Integer.parseInt(wantCards.nextToken());
            bufferedWriter.write(cards.getOrDefault(wantCard, 0) + " ");
        }
        
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
