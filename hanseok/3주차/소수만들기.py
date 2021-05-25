import itertools
nums = [1, 2, 7, 6, 4]
cnt =0
can = itertools.combinations(nums, 3)
can2 = list(itertools.combinations(nums, 3)) #중복없이 숫자 3개씩 출력
print(can2)
#[(1, 2, 7), (1, 2, 6), (1, 2, 4), (1, 7, 6), (1, 7, 4), (1, 6, 4), (2, 7, 6), (2, 7, 4), (2, 6, 4), (7, 6, 4)]

for i in can:
    can_sum = sum(i) #(1, 2, 7) 더한값
    print("시작값 = "+str(can_sum))
    for j in range(2,can_sum): #2부터 (1, 2, 7) 더한값 10까지 for문
        print("j = "+str(j))
        print("cnc = " + str(can_sum%j))
        if can_sum%j == 0: #소수가 되려면 1과 자기 자신과 나눠져야만 나눠져야 하므로
                           # 0이 되면 breck 걸어주고
            break
    else: #break 걸리지 않은 곳에서만 +1 해준다
        print("sum = "+str(can_sum))
        cnt += 1
print(cnt)

#제출용
def solution(nums):
    answer = 0
    can = itertools.combinations(nums, 3)

    for i in can:
        can_sum = sum(i)
        for j in range(2, can_sum):
            if can_sum % j == 0:
                break
        else:
            answer += 1
    return answer