def solution(new_id):
    # 1.소문자로 변경
    new_id = new_id.lower()
    
    # 2.특수문자 제거
    icon = '~!@#$%^&*()=+[{]}:?,<>/'
    new_id = [i for i in new_id if i not in icon]
    new_id = ''.join(new_id)
    
    # 3.'.' 중복시 제거
    while '..' in new_id :
        new_id = new_id.replace('..', '.')
    
    # 4.처음이나 끝에 오는 . 제거
    if new_id and new_id[0] == '.' :
        new_id = new_id[1:]
    if new_id and new_id[-1] == '.' :
        new_id = new_id[:-1]
        
    # 5.빈 문자열일 경우 a 대입
    if not new_id :
        new_id = 'a'
    
    # 6.16자 이상일 경우 뒤 생략
    if len(new_id) >= 16 :
        new_id = new_id[:15]
        if new_id[-1] == '.' :
            new_id = new_id[:-1]
    
    # 7.2자 이하일 경우 마지막 문자를 반복
    while len(new_id) <= 2 :
        new_id += new_id[-1]
    
    return new_id
