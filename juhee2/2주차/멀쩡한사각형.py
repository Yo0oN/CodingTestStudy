from math import gcd # 최대 공약수 함수 import
def solution(w,h):
    answer = 1
    
    n = gcd(w, h)
    unusable_squ = ((w // n) + (h // n) - 1) * n
    
    return (w * h) - unusable_squ
