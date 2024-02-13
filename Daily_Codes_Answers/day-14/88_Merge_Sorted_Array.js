const merge = (nums1,  m, nums2, n)=>{
    let i=m-1
    let j=n-1
    let x=n+m-1
    while(i>=0 || j>=0){
        if(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[x] = nums1[i]
                i-=1
            }else{
                nums1[x] = nums2[j]
                j-=1
            }
        }else if(i>=0){
            nums1[x] = nums1[i]
            i-=1
        }else if(j>=0){
            nums1[x] = nums2[j]
            j-=1
        }     
        x-=1
    }
        
    return nums1
}

let num1 = [1,2,3,0,0,0]
let m = 3
let num2 = [2,3,6]
let n = 3
console.log("-- test case 1 --")
console.log("Input : num1 : ",num1,", m : ",m," / num2 : ",num2," , n : ",n,"\nOutput :", merge(num1,m, num2,n))