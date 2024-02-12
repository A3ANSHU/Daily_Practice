def merge(nums1,  m, nums2, n):
    i=m-1
    j=n-1
    x=n+m-1
    while(i>=0 or j>=0):
        if(i>=0 and j>=0):
            if(nums1[i]>nums2[j]):
                nums1[x] = nums1[i]
                i-=1
            else:
                nums1[x] = nums2[j]
                j-=1
    
        elif(i>=0):
            nums1[x] = nums1[i]
            i-=1
        elif(j>=0):
            nums1[x] = nums2[j]
            j-=1
        x-=1

    return nums1

num1 = [1,2,3,0,0,0]
m = 3
num2 = [2,3,6]
n = 3
print("-- test case 1 --")
print("Input : num1 : ",num1,", m : ",m," / num2 : ",num2," , n : ",n,"\nOutput :", merge(num1,m, num2,n))