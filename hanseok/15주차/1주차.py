def solution(price, money, count):
    total = 0
    for i in range(1, count+1): #금액이 부족하지 않으면 0을 return 하세요.
        total += price*i
    if money >= total:
        return 0
    else:
        return total - money


print(solution(price=3, money=20, count=4))