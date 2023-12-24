class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')
              st.push('(');
            else if(c=='{')
              st.push('{');
            else if(c=='[')
              st.push('[');
            else if(c==')')
            {
                if(st.size()>0 && st.peek()=='(')
                  st.pop();
                else
                  return false;
            }
            else if(c==']')
            {
                if(st.size()>0 && st.peek()=='[')
                  st.pop();
                else
                  return false;
            }
            else if(c=='}')
            {
                if(st.size()>0 && st.peek()=='{')
                  st.pop();
                else
                  return false;
            }
        }
        if(st.size()!=0)
          return false;
        else
          return true;
    }
}