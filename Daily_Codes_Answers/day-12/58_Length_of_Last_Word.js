const lengthOfLastWord = (s)=>{
    s= s.trim();
    let temp = s.split(" ");
    return temp[temp.length-1].length;
}

let s1 = "Hello World";
let s2 = "   fly me   to   the moon   ";
let s3 = "luffy is still joyboy";

console.log("-- test case 1 --");
console.log("input : "+s1+"\nOutput : "+lengthOfLastWord(s1));
console.log("-- test case 2 --");
console.log("input : "+s2+"\nOutput : "+lengthOfLastWord(s2));
console.log("-- test case 3 --");
console.log("input : "+s3+"\nOutput : "+lengthOfLastWord(s3));