class Solution {
    public int climbStairs(int n) {
         int n1=1,n2=1,n3 = 1,count=10;    
    
    for(int i=2;i <= n;++i){    
        n3=n1+n2;   
        n1=n2;    
        n2=n3; }
        
    return n3;
        
    }
}
