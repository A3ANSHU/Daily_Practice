const factorial = (s)=>{
    let num=1;
    for(let i=s ; i>=1 ;i--){
        num*=i;
    }
    return num;
}

const climbStairs = (n)=>{
    let step =1;
    let temp =n;
    for(let i = 1 ; i<=temp/2 ; i++){
        let num = factorial(n-1)/(factorial(i)*factorial(n-1-i));
        step+=num;
        n--;
    }
    return step;
}

let n1 = 5;
let n2 = 6;

console.log("-- test case 1 --");
console.log("Input : "+n1+"\nOutput : "+climbStairs(n1));
console.log("-- test case 2 --");
console.log("Input : "+n2+"\nOutput : "+climbStairs(n2));