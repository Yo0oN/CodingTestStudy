# 런타임에러
# def solution(price, money, count):
#     result = money - calPrice(price, count)
#     return 0 if result > 0 else abs(result)

# def calPrice(price, count):
#     cal = 0
#     if count < 1:
#         return cal
#     cal = price * count
#     return cal + calPrice(price, count - 1)

def solution(price, money, count):
    for i in range(1,count + 1):
        money -= price * i

    return 0 if money > 0 else abs(money)
