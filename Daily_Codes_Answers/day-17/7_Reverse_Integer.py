def reverse(x):
    MIN_VALUE = -2**31
    MAX_VALUE = 2**31-1
    flag=False
    if x<0:
        x=-x
        flag=True
    rev=0
    while(x!=0):
        rem = x%10
        rev = rev*10+rem
        x= int(x/10)
    if flag==True:
        rev=-rev
    if(rev<MIN_VALUE or rev>MAX_VALUE):
        return 0
    else:
        return int(rev)
    
    
x1 = 123       
x2 = -123
x3 = 120 

print("-- test case 1 --")
print(f"Input : {x1}\nOutput : {reverse(x1)}")
print("-- test case 2 --")
print(f"Input : {x2}\nOutput : {reverse(x2)}")
print("-- test case 3 --")
print(f"Input : {x3}\nOutput : {reverse(x3)}")