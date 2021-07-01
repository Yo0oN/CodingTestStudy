# def solution(numbers):
#     answer = []
#     s = set()
#     for i in range(len(numbers)) :
#         for j in range(len(numbers)) :
#             if (i == j): continue
#             s.add(numbers[i]+numbers[j])
#     answer = sorted(s)
#     # for i in numbers:
#     #     print(i)
#     return answer

def solution(numbers):
    answer = []
    for i in range(len(numbers)) :
        for j in range(len(numbers)) :
            if (i == j): continue
            answer.append(numbers[i]+numbers[j])
    return sorted(list(set(answer)))
