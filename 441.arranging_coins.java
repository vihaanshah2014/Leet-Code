class Solution {
    public int arrangeCoins(int n) {
    if(n == 1){
        return 1;
    }
    int a = n;
    int rows = -1;
    int sum = 0;
    while(a >= 0){
    sum++;
    a = a - sum;
    rows++;
    
    }
        

    return rows;
    }
}
