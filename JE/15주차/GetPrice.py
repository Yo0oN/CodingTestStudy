def solution(price, money, count):
    answer = 0
    amount = 0

    for i in range(1, count + 1):
        amount += price * i

    answer = money - amount

    if(answer < 0):
        return answer * -1

    if(answer > 0):
        return 0

    return answer