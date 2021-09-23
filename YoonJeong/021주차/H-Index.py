def solution(citations):
    answer = 0
    
    n = len(citations)
    citations.sort()
    
    for i in range(n) :
        # 전체길이 - 인덱스 == h
        # citations[i]가 h보다 크다면 이후의 값들은 모두 h보다 크다
        # 주어진 예시에서 i = 0, h = 5라면 정렬된 citations[0]의 값은 5보다 커야함
        # i가 1씩 커질때마다 h는 1씩 줄어들고, citations[i]값은 h보다 크거나 같아야 조건이 성립한다.
        if citations[i] >= n - i :
            answer = n - i
            break
            
    return answer
