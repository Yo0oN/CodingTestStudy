

# 모든 테스트 케이스 통과
def solution(n, lost, reserve):
    answer = 0
    
    # 이 for문이 없으면 안됨
    for i in reserve:
        if i in lost:
            lost.remove(i)
            reserve.remove(i)

    answer = n - len(lost)

    for i in lost:
        if i in reserve:
            reserve.remove(i)
            answer += 1

        if i-1 in reserve:
            reserve.remove(i-1)
            answer += 1

        elif i+1 in reserve:
            reserve.remove(i+1)
            answer += 1

    return answer