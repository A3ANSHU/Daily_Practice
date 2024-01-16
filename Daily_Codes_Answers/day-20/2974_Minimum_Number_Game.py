def numberGame(nums):
    arr = []
    nums.sort()
    for i in range(0,len(nums),2):
        arr.append(nums[i+1])
        arr.append(nums[i])
    return arr

arr1 = [5,4,2,3]
arr2 = [2,5]

print("-- test case 1 --")
print(f"Input : {arr1}\nOutput : {numberGame(arr1)}")
print("-- test case 2 --")
print(f"Input : {arr2}\nOutput : {numberGame(arr2)}")