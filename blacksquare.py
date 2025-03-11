a =input().split()

sum = 0
c=input()

for i in range(len(c)):
    if c[i]=='1':
        p = int(a[0])
        sum = sum + p
    else:
        if c[i]=='2':
            p = int(a[1])
            sum = sum + p
        else:
            if c[i]=='3':
                p = int(a[2])
                sum = sum + p
            else:
                if c[i]=='4':
                    p = int(a[3])
                    sum = sum + p
print(sum)