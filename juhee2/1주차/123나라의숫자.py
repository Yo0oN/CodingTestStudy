def solution(n):
    answer = ''
    while n >= 1 :
        nMod = n % 3
        if (nMod == 0) :
            answer += '4'
            n = n // 3 - 1
        else :
            answer += str(nMod)
            n = n // 3
    return answer[::-1]
