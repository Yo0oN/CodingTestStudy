def solution(n):
    answer = ''

    while n > 0:
        if n % 3 == 0:
            answer = '4' + answer
            n = int(n / 3 - 1)
        else:
            answer = str(n % 3) + answer
            n = int(n / 3)
    return answer