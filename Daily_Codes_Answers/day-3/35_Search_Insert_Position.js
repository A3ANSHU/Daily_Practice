var position = function(nums, target) {
    let start = 0;
    let end = nums.length-1;
    while(start<end){
        let mid = parseInt(start + (end-start)/2);
        if (nums[mid] == target){
            return mid;
        }if(nums[mid]>target){
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    return start+1;
};

let test_case_1 = [1,3,5,6]
let target_1 = 5
let test_case_2 = [1,3,5,6]
let target_2 = 2
let test_case_3 = [1,3,5,6]
let target_3 = 7

console.log("--- test case 1 ---")
console.log("Input: nums = "+test_case_1+" , target = "+target_1+"\nOutput: "+position(test_case_1,target_1))
console.log("--- test case 2 ---")
console.log("Input: nums = "+test_case_2+" , target = "+target_2+"\nOutput: "+position(test_case_2,target_2))
console.log("--- test case 3 ---")
console.log("Input: nums = "+test_case_3+" , target = "+target_3+"\nOutput: "+position(test_case_3,target_3))