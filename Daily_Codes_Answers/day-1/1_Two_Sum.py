def two_sum(nums,target):
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            if(nums[i]+nums[j]==target):
                return list([i,j])            

test_case_1 = [2,7,11,15]
target_1 = 9
test_case_2 = [3,2,4]
target_2 = 6
test_case_3 = [3,3]
target_3 = 6

print("--- test case 1 ---")
print(f"Input: nums = {test_case_1}, Target = {target_1}\nOutput: {two_sum(test_case_1,target_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}, Target = {target_2}\nOutput: {two_sum(test_case_2,target_2)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_3}, Target = {target_3}\nOutput: {two_sum(test_case_3,target_3)}")