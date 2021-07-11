def solution(s):
    return s[len(s) // 2 - 1 : len(s) // 2 + 1] if len(s) % 2 == 0 else s[len(s) // 2]
