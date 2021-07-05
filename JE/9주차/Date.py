import datetime

# datetime 라이브러리를 사용하여 해당 연,월,일의 요일값을 day라는 배열안에서 찾음
def solution(m, d):
    day = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    return day[datetime.date(2016, m, d).weekday()]