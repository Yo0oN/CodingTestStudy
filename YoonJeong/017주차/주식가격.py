def solution(prices):
    answer = []
    
    for i in range(len(prices)) :
        for j in range(i, len(prices)) :
            if prices[j] < prices[i] :
                answer.append(j - i)
                break
        else :
            answer.append(len(prices) - i - 1)

    return answer
