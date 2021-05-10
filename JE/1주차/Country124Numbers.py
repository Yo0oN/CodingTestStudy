def solution(quo):
    answer = ''

    while quo > 0:
        quo, re = divmod(quo, 3)

        if re == 0:
            quo -= 1
            answer += '4'

        else:
            answer += str(re)

    answer = answer[::-1]

    return answer