class VersionControl:
    def __init__(self,bad):
        self.bad = bad
        
    def isBadVersion(self,version):
        return self.bad<=version

class Solution (VersionControl):
    def firstBadVersion(self,n):

        start=1
        end = n
        while(start<=end):
            mid = start+(end-start)//2
            if(self.isBadVersion(mid)):
                end = mid-1
            else:
                start = mid+1 
    
        return start
    def __init__(self,bad):
        super().__init__(bad)
  
        
s1 = Solution(4)
n1=5
print("-- test case 1 --")
print(f"Input : {n1}\nOutput : {s1.firstBadVersion(n1)}")

s2 = Solution(1)
n2=1
print("-- test case 2 --")
print(f"Input : {n2}\nOutput : {s2.firstBadVersion(n2)}")