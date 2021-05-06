def solution(participant, completion):
    participant.sort()
    completion.sort()

    for player, complete in zip(participant, completion):
        if player != complete:
            return player

    return participant.pop()