def solution(absolutes, signs):
    answer = 0
    result = []

    for num, absN in zip(absolutes, signs):
        if absN == False and num > 0:
            result.append(num * -1)

        elif absN == True and num < 0:
            result.append(num * -1)

        else:
            result.append(num)

    answer = sum(result)
    return answer