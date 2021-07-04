n = 5
arr1 = [9, 20, 28, 18, 11]
arr2 = [30, 1, 21, 17, 28]
answer = []
#자연수 -> 2진수
# bin으로 작성시 '0b11111'가 나오고 0b는 진수를 표현하는 문자이다
# 제거해야 함으로 [2:]

def solution(n, arr1, arr2):
    answer = []
    for i in range(n):
        bin2 = bin(arr1[i]|arr2[i])[2:] #arr1, arr2이진수 변환
        answer.append(("0" *(n - len(bin2)) + bin2).replace("1", "#").replace("0", " "))
    return answer