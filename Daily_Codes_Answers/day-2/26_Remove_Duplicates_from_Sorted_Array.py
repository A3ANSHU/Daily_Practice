def duplicate(nums):
    k = 1
    for i in range(1,len(nums)):
        if(nums[i] != nums[i-1]):
            nums[k] = nums[i]
            k+=1
    return k
        
test_case_1 = [1,1,2]
test_case_2 = [0,0,1,1,1,2,2,3,3,4]

print("--- test case 1 ---")
size_1 = duplicate(test_case_1)
print(f"Input: nums = {test_case_1}\nOutput: {test_case_1[0:size_1]}")

print("--- test case 2 ---")
size_2 = duplicate(test_case_2)
print(f"Input: nums = {test_case_2}\nOutput: {test_case_2[0:size_2]}")