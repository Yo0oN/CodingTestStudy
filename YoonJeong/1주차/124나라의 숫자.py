def solution(n):
    answer = ''
    
    # 10진수를 3진수로 바꾸는 방법을 이용합니다.
    while n > 0 :
        remainder = n % 3
        n = n // 3
        
        # 3진수에서는 0, 1, 2를 하고, 첫자리에 0이 올 수 없습니다. 하지만 124나라에는 0이 없으며, 0을 대신하는 4가 첫자리에 올 수 있습니다.
        # 3진수를 이용하는 방법은 나머지가 0이 나올떄 문제가 생기는데, 나머지가 0이 나오면 나온 몫에서 -1해주면됩니다.
        if remainder == 0 :
            n -= 1
            answer = '4' + answer
        else :
            answer = str(remainder) + answer
            
    return answer
