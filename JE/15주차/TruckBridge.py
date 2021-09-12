def solution(bridge_length, weight, truck_weights):
    answer = 0
    boarding = [0]*bridge_length

    while boarding:
        answer += 1
        boarding.pop(0)

        if truck_weights:
            if sum(boarding) + truck_weights[0] <= weight:
                boarding.append(truck_weights.pop(0))
            else:
                boarding.append(0)

    return answer