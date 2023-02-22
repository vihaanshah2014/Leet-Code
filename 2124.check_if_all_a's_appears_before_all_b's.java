class Solution {
    public boolean checkString(String s) {
    if((s.lastIndexOf("a") <= s.indexOf("b")) || (s.lastIndexOf("a") == -1) || (s.lastIndexOf("b") == -1)){
        return true;
    }
        return false;
        
    }
}
