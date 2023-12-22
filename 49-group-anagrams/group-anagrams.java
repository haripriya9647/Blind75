   class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map = new HashMap<>();
       if(strs==null || strs.length==0)
          return new ArrayList<>();
       for(String s:strs){
           char[] c = s.toCharArray();
           Arrays.sort(c);
           String keystr = String.valueOf(c);
           if(!map.containsKey(keystr))  map.put(keystr,new ArrayList<>());
            map.get(keystr).add(s);
       }
       return new ArrayList<>(map.values());
   }
}
