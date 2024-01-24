const singleNumber = function(nums){
    if(nums.length==1){
        return nums[0];
    }
    nums.sort()
    for(let i=0 ; i<nums.length-1 ; i+=2){
        if(nums[i]!=nums[i+1]){
            return nums[i];
        }
    }
    return nums[nums.length-1]; 
}

let test_case_1 = [2,2,1]
let test_case_2 = [4,1,2,1,2]
let test_case_3 = [1]

console.log("-- test case 1 --")
console.log("Input : "+test_case_1+"\nOutput : "+singleNumber(test_case_1))
console.log("-- test case 2 --")
console.log("Input : "+test_case_2+"\nOutput : "+singleNumber(test_case_2))
console.log("-- test case 3 --")
console.log("Input : "+test_case_3+"\nOutput : "+singleNumber(test_case_3))