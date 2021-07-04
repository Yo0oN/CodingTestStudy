def solution(numbers, target):
    answer = [0]
    for i in range(len(numbers)):
        temp = []
        for j in range(len(answer)):
            temp.append(answer[j] - numbers[i])
            temp.append(answer[j] + numbers[i])

        answer = temp
    return answer.count(target)