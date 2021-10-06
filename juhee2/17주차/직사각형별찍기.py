a, b = map(int, input().strip().split(' '))
for _ in range(b):
    for _ in range(a):
        print('*', end='')
    print()
