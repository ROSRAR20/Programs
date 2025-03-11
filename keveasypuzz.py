t :int
t= int(input())
n:int
s:str
l:int
r:int
f:int

for i in range(t):
    n=int(input())
    b =[0]*n
    str=input()
    f=0
    for j in range(n):
        if(str[j]=='L'):
            l=1
            r=j
        else:
            l=j+2   
            r=n
        if(l>r):
            b[j]=0
        else:
            if(l==r):
                b[j]=1
            else:
                if(l<0 and r<0 ):
                    f=-1
                    break
                else:
                    b[j]=r-l+1
    if f == -1 or b[0]!=b[n-1]:
        print(-1)
    else:
        for i in b:
            print(i,end=" ")            
