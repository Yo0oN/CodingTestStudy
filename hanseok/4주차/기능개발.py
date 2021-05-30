progresses = [93, 30, 55]
speeds     = [1, 30, 5]
answer = []
count = 0
time= 0

while len(progresses)>0:
    if (progresses[0] + time*speeds[0]) >= 100:
        print(progresses)
        progresses.pop(0)
        speeds.pop(0)
        print(progresses)
        count +=1
    else:
        print(progresses[0] + time * speeds[0])
        if count > 0:
            print("count1 = " + str(count))
            answer.append(count)
            count = 0
        time+=1
    print(time)
print("count2 = "+str(count))
answer.append(count)
print(answer)


