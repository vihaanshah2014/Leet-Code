class Solution {
    public double myPow(double x, int n) {
    if((x == -1) && (n % 2 == 0)){
        x = 1;
    }
    if(x == 1){
        return 1;
    }    
    if(x == -1){
        return -1;
    }
    if(n <= -2147483648){
        return 0;
    }
    double temp = x;
    if(n == 0){
        return 1;
    }// 0 test case
    boolean negative = false; 
    if(n < 0){
            negative = true;
            n = n * -1;
    }// fixes negative

    for(int i = 1; i < n;i++){
        x = x * temp;
    }

    if(negative){
        x = 1 / x;
    }

    return x;

        
    }
}
