def solution(n):
    answer = ''
    answer = '수박' * (n // 2) if n % 2 == 0 else '수박' * (n // 2) + '수'
    return answer
