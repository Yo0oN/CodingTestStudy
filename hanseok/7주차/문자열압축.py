s = "aabbaccc" # "2a2b3c"
result = ""
length = []

if len(s) == 1:
        #return 1 문자열이 1일시 1로 return
for cut in range(1, len(s) // 2 + 1):
        count = 1
        tempStr = s[:cut] #처음 자른값
        for i in range(cut,len(s), cut): #cnt부터 len(s)까지 cnt만끔 띄어서 반복
            if s[i:i+cut] == tempStr: #잘린 값과 바로 뒷값이 같으면 count +1
                count += 1
            else:
                if count == 1:
                    count = ""
                result += str(count) + tempStr #반복횟수 자른값 result 중첩
                tempStr = s[i:i+cut] #다음 값 으로 변경
                count = 1
        if count == 1:
            count = ""
        result += str(count) + tempStr
        print(result)
        length.append(len(result)) #문자열 length값 for문이 돌때 마다 넣기
        result = ""
print(length)
print(min(length))#최솟값 return