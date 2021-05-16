# 런타임 에러
# def solution(n, lost, reserve):
#     stu = [1 for i in range(5)]
#     for i in lost:
#         stu[i-1] -= 1
#     for i in reserve:
#         stu[i-1] += 1
    
#     for i in lost:
#         target = i-1
#         prev = target - 1
#         next = target + 1
#         if target == len(stu)-1: # 마지막 요소인 경우
#             if stu[prev] > 1:
#                 stu[target] += 1
#                 stu[prev] -= 1
#         elif target == 0: # 맨 앞 요소인 경우
#             if stu[next] > 1:
#                 stu[target] += 1
#                 stu[next] -= 1
#         else: # 앞,뒤 요소가 있는 경우
#             if stu[prev] > 1:
#                 stu[target] += 1
#                 stu[prev] -= 1
#             elif stu[next] > 1:
#                 stu[target] += 1
#                 stu[next] -= 1
#     return len(stu) - stu.count(0)

def solution(n, lost, reserve):
    _lost = set(lost) - set(reserve)
    _reserve = set(reserve) - set(lost)
    
    for i in _reserve: 
        if i-1 in _lost:
            _lost.remove(i-1)
        elif i+1 in _lost:
            _lost.remove(i+1)
            
    return n - len(_lost)
