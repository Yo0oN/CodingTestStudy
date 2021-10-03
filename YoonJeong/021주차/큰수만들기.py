def solution(number, k):
    stack = []
    leng = len(number) - k
    for n in number :
        # 지울수 있고, 새로 넣을 값이 stack의 마지막 값보다 크다면 stack의 값들을 계속 지워줌
        while stack and k > 0 and stack[-1] < n :
            stack.pop()
            k -= 1
        stack.append(n) # stack의 값이 없거나 더이상 지울수있는 수가 없거나 위를 통과했다면 그냥 넣기
        
    return ''.join(stack[:leng])
