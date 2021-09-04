def solution(n):
    a, b = 0, 1

    for i in range(n):
        a, b = b % 1234567, a+b

    return a