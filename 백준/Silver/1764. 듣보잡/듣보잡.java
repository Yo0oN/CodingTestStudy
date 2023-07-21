import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer NM = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        Set<String> neverListen = new HashSet<>();

        for (int i = 0; i < N; i++) {
            neverListen.add(bufferedReader.readLine());
        }

        Set<String> neverListenLook = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String name = bufferedReader.readLine();
            if (neverListen.contains(name)) {
                neverListenLook.add(name);
            }
        }

        String[] neverListenLooks = neverListenLook.toArray(new String[neverListenLook.size()]);
        bufferedWriter.write(neverListenLooks.length + "\n");
        if (neverListenLooks.length > 0) {
            Arrays.sort(neverListenLooks);
            for (int i = 0; i < neverListenLooks.length; i++) {
                bufferedWriter.write(neverListenLooks[i] + "\n");
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
