def solution(name):
    udCnt = 0 # 알파벳을 변경한 수
    rlCntList = [len(name) - 1] # A를 만났을 때 되돌아가는 경우의 좌우 이동 횟수
    nameI = 0
    
    while nameI < len(name) :
        # 현재 값이 A라면 여기서 뒤로 돌아가서 변경하는 경우 좌우 이동 횟수
        if name[nameI] == 'A' :
            for j in range(nameI, len(name)) :
                if name[j] != 'A':
                    rlCntList.append((len(name) - j) + ((nameI - 1) * 2))
                    nameI = j
                    break
        # 알파벳을 변경한 수
        if ord(name[nameI]) - ord('A') >= ord('Z') - ord(name[nameI]) + 1 :
            udCnt += (ord('Z') - ord(name[nameI]) + 1)
        else :
            udCnt += (ord(name[nameI]) - ord('A'))
        nameI += 1
    # 좌우로 이동한 최소 횟수 + 알파벳 변경 횟수
    return min(rlCntList) + udCnt
