"""a = [1,2,3,4]
b = [-3,-1,0,2]"""
a = [-1,0,1]
b = [1,0,-1]
answer = 0

for i in zip(a,b):
    answer += i[0]*i[1]
print(answer)