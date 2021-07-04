# def solution(a, b):
#     last_day = [31,29,31,30,31,30,31,31,30,31,30,31]
#     day = ['FRI','SAT','SUN','MON','TUE','WED','THU']
#     answer = ''
#     days = 0
#     for i in range(0,a-1):
#         days += last_day[i]
#     days += b
#     days = days % 7
#     return day[days - 1]

def solution(a, b):
    last_day = [31,29,31,30,31,30,31,31,30,31,30,31]
    day = ['FRI','SAT','SUN','MON','TUE','WED','THU']
    
    return day[(sum([last_day[i] for i in range(0,a-1)]) + b) % 7 - 1]
<<<<<<< HEAD
=======
    
>>>>>>> ba1402b0a95a41ad7b66613bd011e492255ec8f1
