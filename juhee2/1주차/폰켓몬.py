def solution(nums):
    answer = 0
    # 첫 번째 풀이
    #s = {}; # set 선언
    # for i in nums :
    #     s.add(i); 
    # cntMon = len(nums) / 2;
    
    # answer = len(s) if cntMon > len(s) else cntMon;
    
    s = set(nums);
    answer = len(s) if len(nums) // 2 > len(s) else len(nums) // 2;
    return answer;
