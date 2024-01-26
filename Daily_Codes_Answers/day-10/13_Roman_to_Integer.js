const romanToInt = (s)=>{
    let I=1;
    let X=10;
    let C=100;

    let value=0;
    for(let i=s.length-1 ; i>=0 ; i--){
        if(s.charAt(i)=='I'){
            value+=I;
            continue;
        }else{
            I=-1;
        }
        if(s.charAt(i)=='V'){
            value+=5;
            continue;
        }
        if(s.charAt(i)=='X'){
            value+=X;
            continue;
        }else{
            X=-10;
        }
        if(s.charAt(i)=='L'){
            value+=50;
            continue;
        }
        if(s.charAt(i)=='C'){
            value+=C;
            continue;
        }else{
            C=-100;
        }
        if(s.charAt(i)=='D'){
            value+=500;
            continue;
        }
        if(s.charAt(i)=='M'){
            value+=1000;
            continue;
        }
    }
    return value;
}
let s1 = "III";
let s2 = "LVIII";
let s3 = "MCMXCIV";

console.log("test case 1 ---> "+s1+" = "+romanToInt(s1));
console.log("test case 2 ---> "+s2+" = "+romanToInt(s2));
console.log("test case 3 ---> "+s3+" = "+romanToInt(s3));