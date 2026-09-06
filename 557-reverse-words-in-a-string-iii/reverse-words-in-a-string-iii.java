class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start =0,
            end = 0;
        while (start<sb.length()){
            while(end<sb.length()&& sb.charAt(end)!=' '){
                end++;
            }
            int p1 = start,
                p2 = end-1;
                while(p1<p2){
                    char temp = sb.charAt(p1);
                    sb.setCharAt(p1, sb.charAt(p2));
                    sb.setCharAt(p2, temp);
                    p1++;
                    p2--;
                }
                start = end+1;
                end = start;
        }
        return sb.toString();
    }
}