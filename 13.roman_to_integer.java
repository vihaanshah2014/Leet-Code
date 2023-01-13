class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        String[] splitted = s.split("(?<=.)");
        int intArray[] = new int[15]; 
        
        for (int i = 0; i < splitted.length; i++) {
            if(splitted[i].equals("I")){
                intArray[i] = 1;
            }
            if(splitted[i].equals("V")){
                intArray[i] = 5;
            }
            if(splitted[i].equals("X")){
                intArray[i] = 10;
            }
            if(splitted[i].equals("L")){
                intArray[i] = 50;
            }
            if(splitted[i].equals("C")){
                intArray[i] = 100;
            }
            if(splitted[i].equals("D")){
                intArray[i] = 500;
            }
            if(splitted[i].equals("M")){
                intArray[i] = 1000;
            }
        }//for loop 1
        
        for(int k = 0; k < 14; k++) {
            if(intArray[k] < intArray[k + 1]){
                intArray[k] = intArray[k] * (-1);
            }//if loop                
        }//removes all of minuses
        
        for(int j = 0; j < intArray.length; j++){
            sum += intArray[j];
        }


        return sum;
        
    }
}
