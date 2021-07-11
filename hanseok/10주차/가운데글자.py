
def solution(s):
    if len(s)%2 == 1: #짝수, 홀수 인지 구분
        return s[len(s)//2] #홀수 가운데 값
    else:
        return s[(len(s)//2)-1:(len(s)//2)+1] # 짝수 -1,+1값