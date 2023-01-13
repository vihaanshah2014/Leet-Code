class Solution {
    public int reverse(int x) {
    int negative = 1;
    if(x < 0){
        x = x * (-1);
        negative = -1;
    }//removes negative

        
    String s = String.valueOf(x);  
    int size = s.length();
        
        
    String[] arr = new String[size];
    for(int q = 0; q < size;q++ ){
        arr[q] = s.substring(q, q+1);
    }//adds to array
    
    int i, k;
    String t = "";
    for (i = 0; i < size / 2; i++) {
        t = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = t;
        }//flips array
        
    String m = "";   
    for (k = 0; k < size; k++) {
        m = m + arr[k];
    }//adds it to a string
        
    if((m.length() > 9) && (m.substring(0,1).equals("8"))){
        return 0;
    }//causes error on max value
    
    long answer =Long.parseLong(m); 
    //makes it into long

        
    
        if(answer >= 2147483647){
        return 0;
    }//makes sure it can be an int
    answer = answer * negative;   
        //makes it negative if it was before
    int fr = (int)answer;
        //back to int!!
        
        
        return fr;
        //we did it 
        
        
    
        
    }
}
