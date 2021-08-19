def solution(bridge_length, weight, truck_weights):
    answer = 0
    idx = 0
    on_bridge = []
    
    answer = 1
    on_bridge.append((answer, truck_weights[idx]))
    while on_bridge:
        answer += 1
        if answer - on_bridge[0][0] == bridge_length:
            on_bridge.pop(0)
        
        if idx < len(truck_weights)-1 and sum([t[1] for t in on_bridge]) + truck_weights[idx + 1] <= weight and len(on_bridge) <= bridge_length:
            idx += 1
            on_bridge.append((answer, truck_weights[idx]))
    return answer
