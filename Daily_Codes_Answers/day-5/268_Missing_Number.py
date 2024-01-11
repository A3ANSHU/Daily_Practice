def missingNumber(nums):
    total=0
    for i in nums:
            total+=i
    return int(((len(nums)*(len(nums)+1))/2)-total)

test_case_1 = [3,0,1]
test_case_2 = [0,1]
test_case_3 = [9,6,4,2,3,5,7,0,1]

print("-- test case 1 --")
print(f"Input : {test_case_1}\nOutput : {missingNumber(test_case_1)}")
print("-- test case 2 --")
print(f"Input : {test_case_2}\nOutput : {missingNumber(test_case_2)}")
print("-- test case 3 --")
print(f"Input : {test_case_3}\nOutput : {missingNumber(test_case_3)}")