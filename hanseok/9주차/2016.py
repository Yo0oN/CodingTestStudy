#1번 풀이
a = 5
b = 24
answer = ''
y = [31,29,31,30,31,30,31,31,30,31,30,31] #마지막 날짜 list
d = ['FRI','SAT','SUN','MON','TUE','WED','THU'] # 2016 1월 1일 금요일이여서 금요일 부터 시작
k = d[(sum(y[:a-1])+b-1)%7] #지난일수%7
print(k)

#2번 풀이
#datetime의 weekday함수 사용
#datetime모듈 날짜생성후 week함수로 요일을 찾는것
#weekday함수는 요일을 정수로 변환하여 반환한다. 월=0 ~ 일=6
import datetime
day = ['MON','TUE','WED','THU','FRI','SAT','SUN']
print(day[datetime.datetime(2016,a,b).weekday()])
