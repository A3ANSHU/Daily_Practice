def factorial(s):
    num=1
    for i in range(s,0,-1):
        num*=i
    return num

def climbStairs(n):
    step =1
    temp =n
    for i in range(1,(temp//2)+1):
        num = factorial(n-1)/(factorial(i)*factorial(n-1-i))
        step+=num
        n-=1
    return int(step)

n1 = 5
n2 = 6

print("-- test case 1 --")
print(f"Input : {n1}\nOutput : {climbStairs(n1)}")
print("-- test case 2 --")
print(f"Input : {n2}\nOutput : {climbStairs(n2)}")
