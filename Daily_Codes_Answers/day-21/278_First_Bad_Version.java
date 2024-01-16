class VersionControl{
    int bad =0;
    VersionControl(int bad){
        this.bad = bad;
    }
    boolean isBadVersion(int version){
        return bad<=version;
    }
}
class Solution extends VersionControl {
    int firstBadVersion(int n) {

        int start=1;
        int end = n;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    Solution(int bad){
        super(bad);
    }
    public static void main(String[] args) {
        Solution s1 = new Solution(4);
        int n1=5;
        System.out.println("-- test case 1 --");
        System.out.println("Input : "+n1+"\nOutput : "+s1.firstBadVersion(n1));

        Solution s2 = new Solution(1);
        int n2=1;
        System.out.println("-- test case 2 --");
        System.out.println("Input : "+n2+"\nOutput : "+s2.firstBadVersion(n2));
        
    }
}