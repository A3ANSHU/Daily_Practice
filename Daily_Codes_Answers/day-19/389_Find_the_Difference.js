const findTheDifference = (s,t)=>{
    let s1 = [...s]
    let t1 = [...t]
    s1.sort();
    t1.sort();
    for(let i=0 ; i<s1.length ; i++){
        if(s1[i]!=t1[i]){
            return t1[i];
        }
    }
    return t1[t1.length-1];
}

let s1 = "abcd";
let t1 = "abcde";
let s2 = "";
let t2 = "y";

console.log("-- test case 1 --");
console.log("Input : s - "+s1+" t - "+t1+"\nOutput : "+findTheDifference(s1,t1));
console.log("-- test case 2 --");
console.log("Input : s - "+s2+" t - "+t2+"\nOutput : "+findTheDifference(s2,t2));