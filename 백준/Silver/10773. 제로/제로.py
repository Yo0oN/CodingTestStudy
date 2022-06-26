import sys

K = int(sys.stdin.readline())

numberStack = []
for k in range(K):
    number = int(sys.stdin.readline())
    if number == 0:
        numberStack.pop();
    else:
        numberStack.append(number)

result = 0
for number in numberStack:
    result += number

sys.stdout.write(str(result))
sys.stdout.flush()
sys.stdout.close()