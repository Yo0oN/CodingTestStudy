class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int area = brown + yellow;
        for (int i=1; i< area/ 2; i++) {
            if (area % i ==0) {
                int x = area / i;
                int y = i;
            
                if (2*(x+y)== brown +4) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }           
        }
        return answer;
    }
}
