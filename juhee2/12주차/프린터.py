def solution(priorities, location):
    p = priorities
    cnt = 0
    while p:
        max_index = p.index(max(p))
        if location > max_index:
            location = location - max_index
        elif location < max_index:
            location = len(p) - (max_index - location)
        else:
            location = 0
        p = p[max_index:] + p[:max_index]
        p.pop(0)
        cnt += 1
        if location == 0: break
        location -= 1
    return cnt
