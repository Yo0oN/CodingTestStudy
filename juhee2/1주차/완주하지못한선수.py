# 효율성 테스트 통과 X
# def solution(participant, completion):
#     for person in completion:
#         participant.remove(person)
#         answer = participant[0]
#     return answer

def solution(participant,completion):
    participant.sort()
    completion.sort()
    for i,j in zip(participant,completion):
        if i != j:
            return i
    return participant[-1]
