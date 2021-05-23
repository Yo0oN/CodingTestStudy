def solution(absolutes, signs):
    answer = 0
    result = []

    for num, sign in zip(absolutes, signs):
        if sign :
            result.append(num)

        else:
            result.append(num * -1)

    answer = sum(result)
    return answer