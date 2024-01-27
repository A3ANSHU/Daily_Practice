const countPrimes = (n)=>{
    if(n<2){
        return 0;
    }
    let count =0;
    for(let i = 2 ; i<n ;i++){
        let prime = true;
        for(let j = 2 ; j<i ; j++){
            if(i%j==0){
                prime = false;
                break;
            }
        }
        if(prime==true){
            count++;
        }
        
    }
    return count;
}
let test_case_1 = 10000;
let test_case_2 = 1;
let test_case_3 = 0;

console.log("-- test case 1 --");
console.log("Input : "+test_case_1+"\nOutput : "+countPrimes(test_case_1));
console.log("-- test case 2 --");
console.log("Input : "+test_case_2+"\nOutput : "+countPrimes(test_case_2));
console.log("-- test case 3 --");
console.log("Input : "+test_case_3+"\nOutput : "+countPrimes(test_case_3));