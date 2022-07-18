import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        HashMap<String, Integer> pokemonMap = new HashMap<>();
        HashMap<Integer, String> indexMap = new HashMap<>();
        int index = 1;
        for (int x = 0; x < N; x++) {
            String pokemon = reader.readLine();
            pokemonMap.put(pokemon, index);
            indexMap.put(index++, pokemon);
        }
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < M; x++) {
            String question = reader.readLine();
            char[] questionArray = question.toCharArray();

            if (Character.isDigit(questionArray[0])) {
                result.append(indexMap.get(Integer.parseInt(question)));
            } else {
                result.append(pokemonMap.get(question));
            }
            result.append("\n");
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}