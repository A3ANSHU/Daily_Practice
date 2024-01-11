def sortColors(nums):
    zero = nums.count(0)
    one = nums.count(1)
    two = nums.count(2)

    i=0
    while(zero!=0 or one!=0 or two!=0):
        if(zero!=0):
            nums[i]=0
            zero-=1
        elif(one!=0):
            nums[i]=1
            one-=1
        else:
            nums[i]=2
            two-=1
        i+=1

test_case_1 = [2,0,2,1,1,0]
test_case_2 = [2,0,1]

print("-- test case 1 --")
print(f"Input : {test_case_1}\nOutput : ")
sortColors(test_case_1)
print(test_case_1)

print("-- test case 2 --")
print(f"Input : {test_case_2}\nOutput : ")
sortColors(test_case_2)
print(test_case_2)