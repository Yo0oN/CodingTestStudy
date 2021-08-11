def solution(bridge_length, weight, truck_weights):
    answer = 1
    
    now_weight = truck_weights[0]
    now_bridge = [(1, truck_weights.pop(0))]
        
    while now_bridge :
        # 다리 위의 트럭들 한칸씩 이동
        now_bridge = [(now[0] + 1, now[1]) for now in now_bridge]
        answer += 1
        # 처음 위치의 트럭이 반대편에 도착하면 배열에서 제거
        if now_bridge and now_bridge[0][0] > bridge_length :
            now_weight -= now_bridge.pop(0)[1]
        
        # 다리에 트럭이 더 올라갈수있다면 올리기
        if truck_weights and truck_weights[0] + now_weight <= weight :
            now_weight += truck_weights[0]
            now_bridge.append((1, truck_weights.pop(0)))
    
    return answer
