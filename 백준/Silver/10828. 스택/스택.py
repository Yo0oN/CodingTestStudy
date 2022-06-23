import sys
def pop (stackList) :
  if len(stackList) > 0 :
    return stackList.pop()  
  return -1

def size(stackList) :
  return len(stackList)

def empty(stackList) :
  if len(stackList) > 0 :
    return 0
  return 1

def top(stackList) :
  if len(stackList) > 0 :
    return stackList[-1]
  return -1

a = sys.stdin.readline().split()
stackList = []
for i in range(0, int(a[0])) :
  b = sys.stdin.readline().split()
  if b[0] =='push' :
    stackList.append(b[1])
  else :
    c = b[0]+'(stackList)'
    print(eval(c))