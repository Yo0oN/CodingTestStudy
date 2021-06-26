def solution(numbers):
    answer = []
    for i in range(0, len(numbers)-1):
        for j in numbers[i+1:]:
            answer.append(numbers[i]+j)
    return sorted(list(set(answer)))