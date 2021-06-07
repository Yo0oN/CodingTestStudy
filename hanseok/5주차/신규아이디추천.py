import re
answer = ''
new_id = "=.="

#1
answer = new_id.lower()
print(answer)
#2
answer = re.sub('[~!@#$%^&*\(\)=+\[\{\]\}:?,\<\>/]','',answer)
print(answer)
#3
answer = re.sub('\.\.+','.',answer)
print(answer)
#4
answer = re.sub('^\.|\.$','',answer)
print(answer)
#5
if not answer:
    answer = 'a'
print(answer)
#6
answer = answer[0:15]
answer = re.sub('\.$','',answer)
print(answer)
#7
print(len(answer))
while len(answer)<3:
    answer += answer[-1:]
    print(answer)

print("ans = "+str(answer))

#제출용
def solution(new_id):
    answer = ''
    answer = new_id.lower()
    answer = re.sub('[~!@#$%^&*\(\)=+\[\{\]\}:?,\<\>/]','',answer)
    answer = re.sub('\.\.+','.',answer)
    answer = re.sub('^\.|\.$','',answer)
    if not answer:
        answer = 'a'
    answer = answer[0:15]
    answer = re.sub('\.$','',answer)
    while len(answer)<3:
        answer += answer[-1:]
    return answer