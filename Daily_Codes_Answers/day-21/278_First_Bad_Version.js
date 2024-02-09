var solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function(n) {
        let start=1;
        let end = n;
        while(start<=end){
            let mid = parseInt(start+(end-start)/2);
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    };
};


let n1=5;
console.log("-- test case 1 --");
console.log("Input : "+n1+"\nOutput : "+solution((n)=>{return n===4})(n1));

let n2=1;
console.log("-- test case 2 --");
console.log("Input : "+n2+"\nOutput : "+solution((n)=>{return n===4})(n2));
