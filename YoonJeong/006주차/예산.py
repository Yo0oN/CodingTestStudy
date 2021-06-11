#while 이용
def solution(d, budget):
    answer = 0
    d.sort()
    while d and budget - d[0] >= 0 :
        budget -= d.pop(0)
        answer += 1
    return answer

#for 이용
def solution(d, budget):
    answer = 0
    d.sort()
    for i in d :
        budget -= i
        if budget < 0 :
            break
        else :
            answer += 1
    return answer
