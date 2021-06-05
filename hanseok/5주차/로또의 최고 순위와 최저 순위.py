lottos = [44, 1, 0, 0, 31, 25]
win_nums= [31, 10, 45, 1, 6, 19]
result = []
rank   = [6,6,5,4,3,2,1]

cnt0 = lottos.count(0)
inte = set(lottos)&set(win_nums) #교집합 추출
min = len(inte)
max = min+cnt0
result.append(rank[max])
result.append(rank[min])

print(result)

#제출용
def solution(lottos, win_nums):
    answer = []
    rank = [6, 6, 5, 4, 3, 2, 1]

    cnt0 = lottos.count(0)
    inte = set(lottos) & set(win_nums)
    min = len(inte)
    max = min + cnt0
    answer.append(rank[max])
    answer.append(rank[min])
    return answer