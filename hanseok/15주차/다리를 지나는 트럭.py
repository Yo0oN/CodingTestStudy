def solution(bridge_length, weight, truck_weights):
    time = 0
    present = [0]*bridge_length #현재 지나가는 트럭 ex)[0,0]
    print(present)
    while len(present) != 0:
        time += 1
        present.pop(0)
        if truck_weights:
            if sum(present)+truck_weights[0]<=weight:
                # sum(present)+truck_weights[0]값이 weight보다 작으면
                # present에 truck_weights[0] append
                # truck_weights[0]값을 삭제
                present.append(truck_weights.pop(0))
            else:
                #무게 초과시 0을 append
                present.append(0)
    return time

print(solution(bridge_length=2
               ,weight=10
               ,truck_weights=[7,4,5,6]))