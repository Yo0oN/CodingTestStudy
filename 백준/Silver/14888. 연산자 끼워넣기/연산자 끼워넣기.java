import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N;
    private static int[] numbers;
    private static int[] operators = new int[4];
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(line.nextToken());
        }

        line = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(line.nextToken());
        }

        sir(numbers[0], 1);

        bufferedWriter.write(max + "\n" + min);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    public static void sir(int number, int count){
        if(count == N){
            max = Math.max(max, number);
            min = Math.min(min, number);
            return;
        }
        for(int i = 0; i < 4; i++){
            if(operators[i] > 0){
                operators[i]--;
                switch(i) {
                    case 0:
                        sir(number + numbers[count], count + 1);
                        break;
                    case 1:
                        sir(number - numbers[count], count + 1);
                        break;
                    case 2:
                        sir(number * numbers[count], count + 1);
                        break;
                    case 3:
                        sir(number / numbers[count], count + 1);
                        break;
                }
                operators[i]++;
            }
        }
    }
}
