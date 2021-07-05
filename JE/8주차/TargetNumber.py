def solution(numbers, target):
    answer = [0]

    for i in range(len(numbers)):
        tmp = []

        for j in answer:
            tmp.append(j+numbers[i])
            tmp.append(j-numbers[i])

        answer = tmp

    return answer.count(target)