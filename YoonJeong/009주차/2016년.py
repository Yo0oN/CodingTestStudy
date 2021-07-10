def solution(a, b):
    monthDate = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    
    date = sum(monthDate[:a - 1]) + b

    return day[(date % 7) - 1]
