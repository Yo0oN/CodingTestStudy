from collections import deque

def solution(prices):
    answer = []
    quePrice = deque(prices)

    while quePrice:
      price = quePrice.popleft()
      time = 0

      for i in quePrice:
        time += 1
        if price > i:
          break

      answer.append(time)

    return answer