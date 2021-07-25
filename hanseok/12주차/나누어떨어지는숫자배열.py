#풀이
#arr에 for문을 돌려 나누었을때 나머지값이 0이면 answer list에 넣는다
#answer list의 길이가 0이면 -1을 넣고
#내림차순으로 출력한다

arr = [2, 36, 1, 3]
divisor = 1
answer = []

for i in arr :
    #print(i % divisor)
    if i % divisor == 0:
        answer.append(i)
if len(answer) == 0:
    answer.append(-1)
print(sorted(answer))

def solution(arr, divisor):
    answer = []
    for i in arr:
        if i % divisor == 0:
            answer.append(i)
    if len(answer) == 0:
        answer.append(-1)
    return sorted(answer)