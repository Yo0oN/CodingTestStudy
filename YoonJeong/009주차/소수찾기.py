from itertools import permutations

def solution(numbers):
    answer = 0
    pick_nums = set()
    
    for i in range(1, len(numbers) + 1) :
        # per_nums에는 각 번호들이 다양한 순서로 뽑혀서 들어간다.
        per_nums = list(permutations(numbers, i))
        # 숫자를 set에 넣어준다.
        for j in per_nums :
            pick_nums.add(int(''.join(j)))
    
    # 소수 확인
    for i in pick_nums :
        if i < 2 :
            continue
        flag = True
        for j in range(2, int(i ** 0.5) + 1) :
            if i % j == 0 :
                flag = False
                break
        if flag :
            answer += 1

    return answer
