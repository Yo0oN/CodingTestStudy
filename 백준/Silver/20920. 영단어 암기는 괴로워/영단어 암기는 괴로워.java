import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer NM = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if (word.length() < M) {
                continue;
            }
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        List<String> words = new ArrayList<>(wordsMap.keySet());

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 자주 나오는 단어일수록 앞에 배치
                if (wordsMap.get(o1) != wordsMap.get(o2)) {
                    return wordsMap.get(o2) - wordsMap.get(o1);
                }
                // 해당 단어의 길이가 길수록 앞에 배치
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치
                return o1.compareTo(o2);
            }
        });

        for (String word : words) {
            bufferedWriter.write(word + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
