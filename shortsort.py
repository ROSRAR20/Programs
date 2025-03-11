a=int(input())

b=[]
for i in range (a):  
    ele=input()
    b.append(ele)

c=0
for w in b:
    c=0
    if not w[0] == 'a':
        c+=1
    if not w[1] == 'b':
        c+=1
    if not w[2] == 'c':
        c+=1
    if(c<=2):
        print('YES')
    else:
        print('NO')