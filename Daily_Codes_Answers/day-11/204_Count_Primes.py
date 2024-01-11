#TLE

def countPrimes( n) :    
    if(n<2):
        return 0
        
    count =0
    for i in range(2,n+1):
        prime = True
        for j in range(2,i):
            if(i%j==0):
                prime = False
                break
        if(prime==True):
            count+=1       
    return count

test_case_1 = 10000
test_case_2 = 1
test_case_3 = 0

print("-- test case 1 --")
print(f"Input : {test_case_1}\nOutput : {countPrimes(test_case_1)}")
print("-- test case 2 --")
print(f"Input : {test_case_2}\nOutput : {countPrimes(test_case_2)}")
print("-- test case 3 --")
print(f"Input : {test_case_3}\nOutput : {countPrimes(test_case_3)}")