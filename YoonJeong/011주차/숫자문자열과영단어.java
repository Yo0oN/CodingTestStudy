import java.lang.NumberFormatException;

class Solution {
    public int solution(String s) {
        String[] alphas = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphas[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}
