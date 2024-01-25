const findPeakElement = (nums)=>{
    let start=0;
    let end = nums.length-1;
    let mid=0;
    while(start<end){
        mid = parseInt(start + (end-start)/2);
        if(nums[mid]>nums[mid+1]){
            end = mid;
        }else{
            start = mid+1;
        }
    }
    return start;
}

let test_case_1 = [1,2,3,1]
let test_case_2 = [1,2,1,3,5,6,4]

console.log("-- test case 1 --")
console.log("Input : "+test_case_1+"\nOutput : "+findPeakElement(test_case_1))
console.log("-- test case 2 --")
console.log("Input : "+test_case_2+"\nOutput : "+findPeakElement(test_case_2))