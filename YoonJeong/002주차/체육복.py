def solution(n, lost, reserve):
    answer = 0
    # 각 학생들이 가지고 있는 체육복의 수
    students = [(2 if i + 1 in reserve else 1) for i in range(n)]
    
    # 도난당한 후의 체육복 수
    students = [(students[i] - 1 if i + 1 in lost else students[i]) for i in range(n)]
    
    for i in range(1, n - 1) :
        if students[i] == 0 : # 체육복 없을 경우
            if students[i - 1] == 2 : # 앞사람이 있으면 앞사람에게 대여
                students[i - 1], students[i] = 1, 1
            elif students[i + 1] == 2 : # 뒷사람이 있으면 뒷사람에게 대여
                students[i], students[i + 1] = 1, 1
        elif students[i] == 2 : # 여분 체육복이 있을 경우
            if students[i - 1] == 0 : # 앞사람이 체육복 없으면 앞사람에게 대여
                students[i - 1], students[i] = 1, 1
            elif students[i + 1] == 0 : # 뒷사람이 체육복 없으면 뒷사람에게 대여
                students[i], students[i + 1] = 1, 1
        # 체육복이 하나만 있으면 아무일도 일어나지 않음
    
    answer = students.count(1) + students.count(2)
    return answer
