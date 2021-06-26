# 약수 = 나누기를 했을때 0이 되는수
# left ~ right까지의 약수를 구하
def solution(left, right):
    answer = 0
    count = 0
    for num in range(left, right+1):
        for i in range(1, num+1):
            if num%i == 0:
                count +=1
        if count % 2 == 0:
            answer += num
        else:
            answer -= num
        count = 0
    return answer