const isPalindrome = function(x){
    if(x<0){
        return false;
    }
    let temp=0;
    let x1=x;
    while(x1!=0){
        temp = temp*10+(x1%10);
        x1=parseInt(x1/10);
    }
    if(temp==x){
        return true;
    }else{
        return false;
    }
}

let test_cse_1 = 121
let test_cse_2 = -121
let test_cse_3 = 10

console.log("-- test case 1 --")
console.log("Input : "+test_cse_1+"\nOutput : "+isPalindrome(test_cse_1));
console.log("-- test case 2 --")
console.log("Input : "+test_cse_2+"\nOutput : "+isPalindrome(test_cse_3));
console.log("-- test case 3 --")
console.log("Input : "+test_cse_3+"\nOutput : "+isPalindrome(test_cse_3));
