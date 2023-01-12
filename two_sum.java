import java.util.ArrayList;


class Solution {//start class
    public int[] twoSum(int[] nums, int target) {
    
    int c = 0;
    int a = 0;
    int b = 1;
    int find = 0;
    
    while(c == 0){

    for (int i=0; i<nums.length; i++) { //open main for
        find = target - nums[i];
        for(int v = 0;(v < nums.length && v != i); v++){
          if(find == nums[v]){
            a = v;
            b = i;
            c = 1;
          }//end if 
        }//end v
    }//end i
    }//end while

    int numbers[] = {a, b};
    return numbers;
    }//end main
}//end class
