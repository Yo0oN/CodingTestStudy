# 테스트 케이스 1개 통과못했음 90.9점
# def solution(progresses, speeds):
#     answer = []
#     left = []
#
#     for i, s in zip(progresses, speeds):
#         leftTasks = (100 - i) / s
#         left.append(leftTasks)
#
#     l = 0
#     r = 1

#     while r < len(left):
#         if left[l] < left[r]:
#             answer.append(r-l)
#             l = r
#         r += 1
#     answer.append(r-l)
#
#     return answer


def solution(progresses, speeds):
    answer = []
    time = 0
    count = 0

    while len(progresses) > 0:
        if (progresses[0] + time * speeds[0]) >= 100:
            progresses.pop(0)
            speeds.pop(0)
            count += 1

        else:
            if count > 0:
                answer.append(count)
                count = 0
            time += 1

    answer.append(count)

    return answer