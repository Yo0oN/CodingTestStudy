# def solution(n):
    
#     result = ''
#     while(divmod(n, 3)[0] >= 1):
#         n, r = divmod(n, 3)
#         result += str(r)
#     result += str(n)
    
#     return sum([(3**i) * int(result[::-1][i]) for i in range(len(result)) if result[::-1][i] != '0'])

def solution(n):
    result = ''
    while n:
        result += str(n % 3)
        n = n // 3
    
    return int(result, 3)
