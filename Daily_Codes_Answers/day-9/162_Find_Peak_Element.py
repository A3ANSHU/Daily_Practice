def findPeakElement(nums):
    start=0
    end = len(nums)-1
    while(start<end):
        mid = int(start + (end-start)/2)
        if(nums[mid]>nums[mid+1]):
            end = mid
        else:
            start = mid+1
    
    return start

test_case_1 = [1,2,3,1]
test_case_2 = [1,2,1,3,5,6,4]

print("-- test case 1 --")
print(f"Input : {test_case_1}\nOutput : {findPeakElement(test_case_1)}")
print("-- test case 2 --")
print(f"Input : {test_case_2}\nOutput : {findPeakElement(test_case_2)}")