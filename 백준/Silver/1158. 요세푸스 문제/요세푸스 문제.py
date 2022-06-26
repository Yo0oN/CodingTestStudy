import sys
from collections import deque

n_k = sys.stdin.readline().split()
# 사람 수
n = int(n_k[0])
# 빠질 번호
k = int(n_k[1])

myDeque = deque()
for i in range(1, n + 1) :
  myDeque.append(i)

resultList = []

num = 1

# myDeque 끝날때까지 반복
while len(myDeque) > 0 :
  # 만약 3의 배수번이라면 해당 수를 뺀다.
  if num % k  == 0 :
    resultList.append(myDeque.popleft())
  else :
    myDeque.append(myDeque.popleft())
  num += 1

result = "<"
for i in resultList :
  result += str(i)
  if (i != resultList[-1]) :
    result += ", "
result += ">"
print(result)