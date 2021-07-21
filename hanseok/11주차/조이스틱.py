name = "JAN"
#상하
#ord -> 문자값을 유니코드로 변환
#min() -> 값중 최소값 찾아줌
#for문 i값에서 아스키코드'A'뺀값, 'Z'에서 뺀값을 비교해서 최소값을 change list에 넣는다
change = [min(ord(i)-ord('A'),ord('Z')-ord(i)+1) for i in name]
print(change)
idx = 0
answer = 0
while True:
    print("idx = "+str(change[idx]))
    answer += change[idx]
    change[idx] = 0
    print("idx2 = " + str(answer))
    if sum(change) == 0:
        break #모든 알파벳을 다 돌아서 sum값 0 이면 나온다
    #좌우 알파벳이 나오기까지 좌우 거리 구한다
    left = 1
    right= 1
    #먼저 0되는 값이 최솟값
    while change[idx - left] == 0:
        print("1")
        left += 1
    while change[idx +right] == 0:
        print("2")
        right+= 1
    answer += left if left < right else right
    idx += -left if left < right else right

print(answer)


def solution(name):
    change = [min(ord(i) - ord('A'), ord('Z') - ord(i) + 1) for i in name]
    idx = 0
    answer = 0

    while True:
        answer += change[idx]
        change[idx] = 0
        if sum(change) == 0:
            break
        left = 1
        right = 1
        while change[idx - left] == 0:
            left += 1
        while change[idx + right] == 0:
            right += 1
        answer += left if left < right else right
        idx += -left if left < right else right

    return answer