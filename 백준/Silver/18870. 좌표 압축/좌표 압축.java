import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] xs = new int[N];
        Map<Integer, Integer> xMap = new HashMap();
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) {
            xs[i] = Integer.parseInt(line.nextToken());
            xMap.put(xs[i], 0);
        }

        Integer[] dupXs= xMap.keySet().toArray(new Integer[xMap.size()]);
        Arrays.sort(dupXs);
        for (int i = 0; i < xMap.size(); i++) {
            xMap.put(dupXs[i], i);
        }

        for (int x : xs) {
            bufferedWriter.write(xMap.get(x) + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
