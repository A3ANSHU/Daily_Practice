var missingNumber = function(nums) {
    let total=0
    for(let i=0 ; i<nums.length ; i++){
        total+=nums[i]
    }
    return ((nums.length*(nums.length+1))/2)-total
};

let test_case_1 = [3,0,1]
let test_case_2 = [0,1]
let test_case_3 = [9,6,4,2,3,5,7,0,1]

console.log("-- test case 1 --")
console.log("Input : "+test_case_1+"\nOutput : "+missingNumber(test_case_1))
console.log("-- test case 2 --")
console.log("Input : "+test_case_2+"\nOutput : "+missingNumber(test_case_2))
console.log("-- test case 3 --")
console.log("Input : "+test_case_3+"\nOutput : "+missingNumber(test_case_3))