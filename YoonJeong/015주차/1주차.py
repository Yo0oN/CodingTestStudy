def solution(price, money, count):
    for i in range(count) :
        money -= (i + 1) * price
    return abs(money) if money < 0 else 0
