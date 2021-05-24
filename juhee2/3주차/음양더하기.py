# 첫번째 풀이
# def solution(absolutes, signs):
#     answer = 123456789
#     return sum([absolutes[i] if signs[i] else absolutes[i] * (-1) for i in range(len(absolutes))])

def solution(absolutes, signs):
    return sum([a if s else -a for a,s in zip(absolutes, signs)])
