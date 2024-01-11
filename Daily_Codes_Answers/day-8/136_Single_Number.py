def singleNumber(nums):
    if(len(nums)==1):
        return nums[0]
    
    nums.sort()
    for i in range(0,len(nums)-1,2):
        if(nums[i]!=nums[i+1]):
                return nums[i]
    return nums[len(nums)-1]
            
test_case_1 = [2,2,1]
test_case_2 = [4,1,2,1,2]
test_case_3 = [1]

print("-- test case 1 --")
print(f"Input : {test_case_1}\nOutput : {singleNumber(test_case_1)}")
print("-- test case 2 --")
print(f"Input : {test_case_2}\nOutput : {singleNumber(test_case_2)}")
print("-- test case 3 --")
print(f"Input : {test_case_3}\nOutput : {singleNumber(test_case_3)}")