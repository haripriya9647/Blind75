class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+","");
	
	// CONVERT STRING TO LOWERCASE
	s = s.toLowerCase();
	
	// REMOVING ALL SPECIAL SYMBOLS  FROM STRING
	s = s.replaceAll("[^a-zA-Z0-9]", ""); 
    
    if(s.length() == 0 || s.length() == 1){
        return true;
    }
    
    String str = "";
    for(int i=s.length()-1;i>=0;--i){
        str = str + s.charAt(i);
    }
    if(s.equals(str))
       return true;
    else
       return false;
    }
}