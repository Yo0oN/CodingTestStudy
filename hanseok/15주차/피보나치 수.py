def solution(n):
    a,b = 0,1 #a=0, b=1
    for i in range(n):
        a,b = b, a+b
        #a -> b
        #b -> a+b
    return a%1234567

print(solution(n=3))