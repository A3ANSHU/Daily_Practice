var two_sum = function(nums, target) {
    for(let i=0 ; i<nums.length ; i++){
        for(let j=i+1 ; j<nums.length ; j++){
            if(nums[i]+nums[j] === target){
                return [i,j]
            }
        }
    }
    return [-1]
};
var twoSum = function(nums, target) {
    for(let i=0 ; i<nums.length ; i++){
        if(nums.indexOf(target-nums[i])!==-1 && i!=nums.indexOf(target-nums[i]))return [i,nums.indexOf(target-nums[i])]
    }
};

let test_case_1 = [2,7,11,15]
let target_1 = 9
let test_case_2 = [3,2,4]
let target_2 = 6
let test_case_3 = [3,3]
let target_3 = 6

console.log("--- test case 1 ---")
console.log("Input: nums = "+test_case_1+", Target = "+target_1+"\nOutput: "+two_sum(test_case_1,target_1))
console.log("--- test case 2 ---")
console.log("Input: nums = "+test_case_2+", Target = "+target_2+"\nOutput: "+two_sum(test_case_2,target_2))
console.log("--- test case 2 ---")
console.log("Input: nums = "+test_case_3+", Target = "+target_3+"\nOutput: "+two_sum(test_case_3,target_3))
