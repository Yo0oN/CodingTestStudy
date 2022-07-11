import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> trees = new HashMap<>();
        int count = 0;
        while(true) {
            String tree = reader.readLine();
            if (tree == null || "".equals(tree)) {
                break;
            }
            trees.put(tree, trees.getOrDefault(tree, 0) + 1);
            count++;
        }

        String[] treesKey = trees.keySet().toArray(new String[0]);
        Arrays.sort(treesKey);

        StringBuilder result = new StringBuilder();
        for (int x = 0; x < treesKey.length; x++) {
            result.append(treesKey[x]);
            result.append(" ");
            float per = (float) trees.get(treesKey[x]) / count * 100;
            result.append(String.format("%.4f", per));
            result.append("\n");
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}