def solution(a, b):
    answer = 0

    for aNum, bNum in zip(a, b):
        answer += (aNum * bNum)

    return answer