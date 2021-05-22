"""absolutes = [4, 7, 12]
signs = ['true', 'false', 'true']"""
absolutes = [1, 2, 3]
signs = ['false', 'false', 'true']

def solution(absolutes, signs):
    answer = 0
    for i in range(len(absolutes)):
        if signs[i]:
            answer += absolutes[i]
        else:
            answer += -absolutes[i]
    return answer