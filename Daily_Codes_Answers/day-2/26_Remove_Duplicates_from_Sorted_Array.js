var removeDuplicates = function(nums) {
    let k=1;
    for(let i=1 ; i<nums.length ; i++){
        if(nums[i] != nums[i-1]){
            nums[k] = nums[i]
            k++
        }
    }
    return k
};
let test_case_1 = [1,1,2]
let test_case_2 = [0,0,1,1,1,2,2,3,3,4]

console.log("--- test case 1 ---")
let size_1 = removeDuplicates(test_case_1)
console.log("Input: nums = "+test_case_1+"\nOutput: [");
for(let i=0 ; i<size_1-1 ; i++){
    console.log(test_case_1[i]+", ");
}
console.log(test_case_1[size_1-1]+"]");

console.log("--- test case 2 ---")
let size_2 = removeDuplicates(test_case_2)
console.log("Input: nums = "+test_case_2+"\nOutput: [");
for(let i=0 ; i<size_2-1 ; i++){
    console.log(test_case_2[i]+", ");
}
console.log(test_case_2[size_2-1]+"]");