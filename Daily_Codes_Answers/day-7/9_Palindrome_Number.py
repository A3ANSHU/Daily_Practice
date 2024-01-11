def isPalindrome(x):
    if(x<0):
        return False
    temp=0
    x1=x
    while(x1!=0):
        temp = temp*10+(x1%10)
        x1//=10
    if(temp==x):
        return True
    else:
       return False
    
test_cse_1 = 121
test_cse_2 = -121
test_cse_3 = 10

print("-- test case 1 --")
print(f"Input : {test_cse_1}\nOutput : {isPalindrome(test_cse_1)}")
print("-- test case 2 --")
print(f"Input : {test_cse_2}\nOutput : {isPalindrome(test_cse_2)}")
print("-- test case 3 --")
print(f"Input : {test_cse_3}\nOutput : {isPalindrome(test_cse_3)}")