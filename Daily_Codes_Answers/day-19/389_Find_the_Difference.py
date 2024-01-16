def findTheDifference(s,t):
    s1 = list(s)
    t1 = list(t)
    
    s1.sort()
    t1.sort()
    
    for i in range(len(s1)):
        if(s1[i]!=t1[i]):
            return t1[i]
    return t1[len(t1)-1]

s1 = "abcd"
t1 = "abecd"
s2 = ""
t2 = "y"

print("-- test case 1 --")
print(f"Input : s - {s1} t - {t1}\nOutput : {findTheDifference(s1,t1)}")
print("-- test case 2 --")
print(f"Input : s - {s2} t - {t2}\nOutput : {findTheDifference(s2,t2)}")