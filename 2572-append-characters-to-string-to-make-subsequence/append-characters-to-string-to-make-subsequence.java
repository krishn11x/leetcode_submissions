class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,
            j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                
                i++;
                j++;
            }else{
                i++;
            }
        }
        int j_index = t.length()-j;
        return j_index;
    }
}