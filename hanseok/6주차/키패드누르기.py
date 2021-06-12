import math
from turtle import distance #프로그래머스에서 인식안됨
"""
numbers = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
hand    = "right"
answer  = ''
last_l = '*'
last_r = '#'

pad = { '1':(0,0), '2':(0,1), '3':(0,2),
        '4':(1,0), '5':(1,1), '6':(1,2),
        '7':(2,0), '8':(2,1), '9':(2,2),
        '*':(3,0), '0':(3,1), '#':(3,2)}

for num in numbers:
        if num in [3, 6, 9]: #오른쪽
                answer += 'R'
                last_r = num
        elif num in [1, 4, 7]: #왼쪽
                answer += 'L'
                last_l = num
        elif num in [2, 5, 8, 0]:
                street_r = distance(last_r, num) #마지막 오른손 위치 현재 입력해야하는 숫자 거리값 비교
                street_l = distance(last_l, num)
                if street_r > street_l:
                        answer += 'L'
                        last_l = num
                elif street_l > street_r:
                        answer += 'R'
                        last_r = num
                elif street_l==street_r:
                        if hand == 'right':
                                answer += 'R'
                                last_r = num
                        else:
                                answer += 'L'
                                last_l = num
print(answer)"""

import math


def solution(numbers, hand):
        answer = ''
        last_l = '*'
        last_r = '#'

        pad = {'1': (0, 0), '2': (0, 1), '3': (0, 2),
               '4': (1, 0), '5': (1, 1), '6': (1, 2),
               '7': (2, 0), '8': (2, 1), '9': (2, 2),
               '*': (3, 0), '0': (3, 1), '#': (3, 2)}
        for num in numbers:
                if num in [3, 6, 9]:
                        answer += 'R'
                        last_r = num
                elif num in [1, 4, 7]:
                        answer += 'L'
                        last_l = num
                elif num in [2, 5, 8, 0]:
                        last_pad = pad[str(num)]
                        l_pad = pad[str(last_l)]
                        r_pad = pad[str(last_r)]
                        street_r = abs(last_pad[0] - r_pad[0]) + abs(last_pad[1] - r_pad[1])
                        street_l = abs(last_pad[0] - l_pad[0]) + abs(last_pad[1] - l_pad[1])

                        if street_r > street_l:
                                answer += 'L'
                                last_l = num
                        elif street_l > street_r:
                                answer += 'R'
                                last_r = num
                        elif street_l == street_r:
                                if hand == 'right':
                                        answer += 'R'
                                        last_r = num
                                else:
                                        answer += 'L'
                                        last_l = num
        return answer