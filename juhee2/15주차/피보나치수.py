# def solution(n):
#     answer = fibo(n)
#     return answer

# def fibo(n):
#     if (n == 0):
#         return 0
#     if (n == 1):
#         return 1
#     return (fibo(n-2)%1234567 + fibo(n-1)%1234567) % 1234567

def solution(n):
    f = [0,1] + [0 for _ in range(n-1)]

    for i in range(2,n+1):
        f[i] = f[i-2] + f[i-1]
        
    return f[n] % 1234567

