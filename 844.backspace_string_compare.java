class Solution {
    public boolean backspaceCompare(String s, String t) {
        return turnToStack(s).equals(turnToStack(t));
    }

    public Stack<Character> turnToStack(String s){
        Stack<Character> newString = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '#' && !newString.isEmpty()){
                newString.pop();
                continue;
            } else if(curr == '#'){
                continue;
            }

            newString.push(curr);
        }
        return newString;
    }
}
