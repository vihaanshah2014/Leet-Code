class Solution {
    public int numberOfSteps(int num) {
    int step = 0;
    while(num != 0){
        if((num % 2) == 1){
            num--;
            step++;
        }//end if
        else{
            num = num/2;
            step++;
        }//end else
    }//enf for
        return step;
        
    }
}
