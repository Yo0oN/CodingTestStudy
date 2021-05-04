def solution(nums):
    answer = 0

    # set에 넣어 몇 종류의 폰켓몬이 있는지 구한다.
    lenOfNumsSet = len(set(nums))
    # 폰켓몬의 종류 수가 절반 이상이라면 가져가는 폰켓몬의 종류는 절반의 수와 같다.
    if lenOfNumsSet >= (len(nums) // 2) :
        answer = (len(nums) // 2)
    else : # 만약 절반 미만이라면 가져가는 폰켓몬의 종류수만큼만 고를 수 있다.
        answer = lenOfNumsSet
    
    return answer
