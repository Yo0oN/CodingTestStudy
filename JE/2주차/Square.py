import math

def solution(w,h):
    answer = 1
    total = w * h
    noUse = w + h - math.gcd(w, h)

    answer = total - noUse

    return answer