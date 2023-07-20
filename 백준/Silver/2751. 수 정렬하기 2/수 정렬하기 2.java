import java.io.*;
import java.util.Arrays;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }

        numbers = mergeSort(numbers);
        for (int number : numbers) {
            bufferedWriter.write(number + "\n");
        }
        bufferedWriter.close();
    }

    private static int[] mergeSort(int[] numbers) {
        int numbersLength = numbers.length;
        if (numbersLength == 1) {
            return numbers;
        }
        // 1. 분리
        int[] leftNumbers = mergeSort(Arrays.copyOfRange(numbers, 0, numbersLength / 2));
        int[] rightNumbers = mergeSort(Arrays.copyOfRange(numbers, numbersLength / 2, numbersLength));
        // 2. 합치기
        return merge(leftNumbers, rightNumbers);
    }

    private static int[] merge(int[] leftNumbers, int[] rightNumbers) {
        int[] mergeNumbers = new int[leftNumbers.length + rightNumbers.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = 0;
        while (leftIndex < leftNumbers.length && rightIndex < rightNumbers.length) {
            if (leftNumbers[leftIndex] < rightNumbers[rightIndex]) {
                mergeNumbers[mergeIndex] = leftNumbers[leftIndex];
                leftIndex++;
            } else {
                mergeNumbers[mergeIndex] = rightNumbers[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }
        while (leftIndex < leftNumbers.length) {
            mergeNumbers[mergeIndex] = leftNumbers[leftIndex];
            leftIndex++;
            mergeIndex++;
        }
        while (rightIndex < rightNumbers.length) {
            mergeNumbers[mergeIndex] = rightNumbers[rightIndex];
            rightIndex++;
            mergeIndex++;
        }
        return mergeNumbers;
    }
}