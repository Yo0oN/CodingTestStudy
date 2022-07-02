import java.util.StringTokenizer;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, " ");        
        int count = tokenizer.countTokens();
        int[] sArray = new int[count];
        
        for (int x = 0; x < count; x++) {
            sArray[x] = Integer.parseInt(tokenizer.nextToken());
        }
        
        Arrays.sort(sArray);
        
        String answer = sArray[0] + " " + sArray[count -1];
        return answer;
    }
}