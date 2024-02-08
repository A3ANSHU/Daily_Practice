const numberGame = (nums)=>{
    let arr = []
    nums.sort()
    for (let i =0 ; i<nums.length ; i+=2){
        arr.push(nums[i+1])
        arr.push(nums[i])
    }
    return arr
}

let arr1 = [5,4,2,3]
let arr2 = [2,5]

console.log("-- test case 1 --");
console.log("Input : "+arr1+"\nOutput : "+numberGame(arr1))
console.log("-- test case 2 --");
console.log("Input : "+arr2+"\nOutput : "+numberGame(arr2))