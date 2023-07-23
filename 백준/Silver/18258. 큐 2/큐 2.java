import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        LinkedList<Integer> Xs = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            String order = line.nextToken();
            int result = 0;
            switch (order) {
                case "push" :
                    int X = Integer.parseInt(line.nextToken());
                    Xs.add(X);
                    break;
                case "pop" :
                    result = Xs.isEmpty() ? -1 : Xs.poll();
                    bufferedWriter.write(result + "\n");
                    break;
                case "size" :
                    result = Xs.size();
                    bufferedWriter.write(result + "\n");
                    break;
                case "empty" :
                    result = Xs.isEmpty() ? 1 : 0;
                    bufferedWriter.write(result + "\n");
                    break;
                case "front" :
                    result = Xs.isEmpty() ? -1 : Xs.peek();
                    bufferedWriter.write(result + "\n");
                    break;
                case "back" :
                    result = Xs.isEmpty() ? -1 : Xs.getLast();
                    bufferedWriter.write(result + "\n");
                    break;
            }

        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
