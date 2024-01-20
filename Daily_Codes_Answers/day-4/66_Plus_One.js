var plus_one = function(digits) {
    for(let i=digits.length-1 ; i>=0 ;i-- ){
        if(digits[i]!=9){
            digits[i]+=1;
            return digits;
        }else{
            digits[i]=0;
        }
    }
    digits[0]=1;
    digits[digits.length] = 0
    return digits;
};

let test_case_1 = [1,2,3]
let test_case_2 = [4,3,2,1]
let test_case_3 = [9]

console.log("--- test case 1 ---")
console.log("Input: nums = "+test_case_1+"\nOutput: "+plus_one(test_case_1));
console.log("--- test case 2 ---")
console.log("Input: nums = "+test_case_2+"\nOutput: "+plus_one(test_case_2));
console.log("--- test case 3 ---")
console.log("Input: nums = "+test_case_3+"\nOutput: "+plus_one(test_case_3));
