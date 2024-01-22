const sortColors = function (nums){
    let zero = 0;
    let one = 0;
    let two = 0;

    for(let num of nums){
        if(num==0)
            zero++;
        if(num==1)
            one++;
        if(num==2)
            two++;
    }
    let i=0;
    while(zero!=0 || one!=0 || two!=0){
        if(zero!=0){
            nums[i]=0;
            zero--;
        }else if(one!=0){
            nums[i]=1;
            one--;
        }else{
            nums[i]=2;
            two--;
        }
        i++;
    }
}


let test_case_1 = [2,0,2,1,1,0]
let test_case_2 = [2,0,1]

console.log("-- test case 1 --")
console.log("Input : "+test_case_1+"\nOutput : ")
sortColors(test_case_1)
console.log(test_case_1)

console.log("-- test case 2 --")
console.log("Input : "+test_case_2+"\nOutput : ")
sortColors(test_case_2)
console.log(test_case_2)