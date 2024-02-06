function strStr(haystack, needle) {
    let x =  haystack.indexOf(needle);
    console.log(x)
}

let haystack1 = "sadbutsad";  
let needle1 = "sad";
let haystack2 = "leetcode"; 
let needle2 = "leeto";

console.log("-- test case 1 --");
console.log("Input : haystack - "+haystack1+", needle - "+needle1+"\nOutput : "+strStr(haystack1, needle1));

console.log("-- test case 2 --");
console.log("Input : haystack - "+haystack2+", needle - "+needle2+"\nOutput : "+strStr(haystack2, needle2));
