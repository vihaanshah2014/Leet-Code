class Solution {
    public boolean isPalindrome(int x) {
    String str = Integer.toString(x);
        
        String nstr="";
        char ch;

      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
        
    if(str.equals(nstr)){
        return true;
    }
    return false;
    }
}
