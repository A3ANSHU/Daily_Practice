def plus_one(digits):
    for i in range(len(digits)-1,-1,-1):
        if digits[i]!=9:
            digits[i]+=1
            return digits
        else:
            digits[i]=0
    digits.insert(0,1)
    return digits           

test_case_1 = [1,2,3]
test_case_2 = [4,3,2,1]
test_case_3 = [9]

print("--- test case 1 ---")
print(f"Input: nums = {test_case_1}\nOutput: {plus_one(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {plus_one(test_case_2)}")
print("--- test case 3 ---")
print(f"Input: nums = {test_case_3}\nOutput: {plus_one(test_case_3)}")