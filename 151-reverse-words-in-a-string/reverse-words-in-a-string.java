class Solution {
    public String reverseWords(String s) {
        //"   hello    world   "
        String trimmed = s.trim();
        // "hello    world"

        String []arr = trimmed.split("\\s+"); // separator maan lega \\s+
        // [hello world]
        int i = 0;
        int j= arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}