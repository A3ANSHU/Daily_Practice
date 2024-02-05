const reverse = (x)=>{
    let rev=0;
        while(x!=0){
            let rem = x%10;
            rev = rev*10+rem;
            x= parseInt(x/10);
        }
        if(rev<Number.MIN_SAFE_INTEGER || rev>Number.MAX_SAFE_INTEGER)
        return 0;
        else
        return rev;
}

let x1 = 123;       
let x2 = -123;
let x3 = 120; 

console.log("-- test case 1 --");
console.log("Input : "+x1+"\nOutput : "+reverse(x1));
console.log("-- test case 2 --");
console.log("Input : "+x2+"\nOutput : "+reverse(x2));
console.log("-- test case 3 --");
console.log("Input : "+x3+"\nOutput : "+reverse(x3));