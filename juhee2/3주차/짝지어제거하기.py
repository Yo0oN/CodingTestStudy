# 첫번째 풀이
# def solution(s):
#     stack = []
#     for str in s:
#         if len(stack) == 0:
#             stack.append(str)
#         elif stack[-1] == str:
#             stack.pop(-1)
#         else:
#             stack.append(str)
#     answer = 1 if len(stack) == 0 else 0

#     return answer

def solution(s):
    stack = []
    for str in s:
        if not stack:
            stack.append(str)
            continue
        if stack[-1] == str:
            stack.pop(-1)
        else:
            stack.append(str)
            
    return 1 if not stack else 0
