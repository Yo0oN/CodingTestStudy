# 연습용 코드
answer = []
array=[1, 5, 2, 6, 3, 7, 4]
commands=[[2, 5, 3], [4, 4, 1], [1, 7, 3]]

print(array)
print(commands)
print(commands[0][0])

for i in range(len(commands)):
    arr = sorted(array[commands[i][0]-1:commands[i][1]])
    answer.append(arr[commands[i][2]-1])

print(answer)

#제출용코드
def solution(array, commands):
    answer = []

    for i in range(len(commands)):
        arr = sorted(array[commands[i][0]-1:commands[i][1]])
        answer.append(arr[commands[i][2]-1])

    return answer
