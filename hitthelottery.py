a=int(input())
c=0
while(a>0):
    if a>=100:
       a-=100
       c+=1
    else: 
        if a>=20:
            a-=20
            c+=1
        else: 
            if a>=10:
                a-=10
                c+=1
            else: 
                if a>=5:
                    a-=5
                    c+=1
                else:
                    a-=1
                    c+=1

print(c)