def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    for i in range(len(citations)):
        if i >= citations[i]:
            answer = i
            break
        else:
            answer = len(citations)
    return answer
