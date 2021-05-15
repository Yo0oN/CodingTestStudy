def solution2(n, lost, reserve):
    setRes = set(reserve) - set(lost)
    setLos = set(lost) - set(reserve)

    for i in setRes:
        y = i - 1
        x = i + 1
        if y in setLos:
            setLos.remove(y)
        elif x in setLos:
            setLos.remove(x)
    return n - len(setLos)

#print(solution2(n=5, lost=[2, 4], reserve=[1,3,5]))
print(solution2(n=5, lost=[2, 4], reserve=[3]))
#print(solution2(n=3, lost=[3], reserve=[1]))