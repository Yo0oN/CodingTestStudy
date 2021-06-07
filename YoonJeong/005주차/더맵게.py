import heapq

# def solution(scoville, K):
#     answer = 0

#     scoville.sort()
    
#     # 음식이 2개 이상, scoville[0]이 K보다 작을경우 음식을 섞는 작업 반복
#     while len(scoville) > 1 and scoville[0] < K :
#         # 지수가 작은 두개의 음식을 섞음
#         new_food = scoville.pop(0) + (scoville.pop(0) * 2)
#         # 새로운 음식을 배열에 넣어줌
#         scoville.append(new_food)
#         scoville.sort()
#         answer += 1
    
#     # 음식이 1개밖에 없는데 K보다 작다면 더이상 불가능함
#     if len(scoville) == 1 and scoville[0] < K :
#         answer = -1
    
#     return answer


def solution(scoville, K):
    answer = 0
    
    heapq.heapify(scoville)
    
    while len(scoville) > 1 and scoville[0] < K :
        # 지수가 작은 두개의 음식을 섞음
        newFood = heapq.heappop(scoville) + (heapq.heappop(scoville) * 2)
        # 새로운 음식을 배열에 넣어줌
        heapq.heappush(scoville, newFood)
        answer += 1
        
    # 음식이 1개밖에 없는데 K보다 작다면 더이상 불가능함
    if len(scoville) == 1 and scoville[0] < K :
        answer = -1
    return answer
