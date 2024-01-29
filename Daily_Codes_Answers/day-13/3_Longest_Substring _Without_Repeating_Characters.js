const lengthOfLongestSubstring = (s)=>{
    let al = []
    let max = 0;
    for(let i=0 ; i<s.length ; i++){
        if(al.includes(s.charAt(i))){
            if(al.length>max){
                max = al.length;
            }
            al=[];
        }
        al.push(s.charAt(i));
    }
    return max;
}

let s1 = "abcabcbb";
let s2 = "bbbbb";
let s3 = "pwwkew";

console.log("-- test case 1 --");
console.log("input : "+s1+"\nOutput : "+lengthOfLongestSubstring(s1));
console.log("-- test case 2 --");
console.log("input : "+s2+"\nOutput : "+lengthOfLongestSubstring(s2));
console.log("-- test case 3 --");
console.log("input : "+s3+"\nOutput : "+lengthOfLongestSubstring(s3));