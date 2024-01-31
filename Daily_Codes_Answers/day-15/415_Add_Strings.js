const addlets = (num1,num2)=>{
    let i = num1.length-1;
    let j = num2.length-1;
    let output = "";

    let rem =0 ; 
    while(i>=0 || j>=0){
        let n1 = 0;
        let n2 = 0;
        if(i>=0){
            n1 = parseInt(""+num1.charAt(i));
            i--;
        }
        if(j>=0){
            n2 = parseInt(""+num2.charAt(j));
            j--;
        }
        let num = n1+n2+rem;
        
        if(num>9){
            rem = 1;
        }else{
            rem = 0;
        }
        
        output = (num%10+output);
        
    }
    return output;
}
let num1 = "11";
let num2 = "123";
console.log("-- test case 1 --");
console.log("Input : num1 : "+num1+" num2 : "+num2+"\nOutput :"+ addlets(num1, num2));

let num3 = "456";
let num4 = "77";
console.log("-- test case 2 --");
console.log("Input : num1 : "+num3+" num2 : "+num4+"\nOutput :"+ addlets(num3, num4));

let num5 = "0";
let num6 = "0";
console.log("-- test case 3 --");
console.log("Input : num1 : "+num5+" num2 : "+num6+"\nOutput :"+ addlets(num5, num6));
