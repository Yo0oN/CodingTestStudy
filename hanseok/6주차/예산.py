d = [1,3,2,5,4]
budget = 9
answer = 0

d.sort() #적은 금액부터 예산처리 위해

for i in d:
    if i <= budget:
        answer += 1
        budget -= i
    else:
        break
print(answer)
