#연습용
#from math import *
w = 8
h = 12
answer = 0
gcd = gcd(w, h) # 최대 공약수

answer = w * h - ((w/gcd+h/gcd)-1) * gcd
print(gcd)
print(answer)

#제출용
from math import * # 최대공약수 사용을 위해 math import

def solution(w,h):
    a = gcd(w, h)
    answer = w*h-(w/a+h/a-1)*a
    return answer

