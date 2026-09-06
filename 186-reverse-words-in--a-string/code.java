import java.util.*;

public class Main {
    
    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        Main obj = new Main();
      
        char[] s = {'a', 'l', 'g', 'o', 'r', 'i', 't', 'h', 'm', ' ', 'd', 'a', 't', 'a', ' ', 's', 't', 'r', 'u', 'c', 't', 'u', 'r', 'e', 's', ' ', 'a', 'r', 'e', ' ', 'v', 'e', 'r', 'y', ' ', 'i', 'm', 'p', 'o', 'r', 't', 'a', 'n', 't'};
      
        // puri change krdi like this -> [e, u, l, b,  , s, i,  , y, k, s,  , e, h, t]
        int i = 0,
            j = s.length - 1;
            
        // obj.swap(s, i, j);

        while(i < j){
          char temp = s[i];
          s[i] = s[j];
          s[j] = temp;
          i++;
          j--;
        }

        // ab word by word seedha krenge

        int start = 0,
            end = 0;

        while (start < s.length) {
            while (end < s.length && s[end] != ' ') {
                end++;
            }

            int p1 = start, p2 = end - 1;

            while(p1 < p2){
              char temp = s[p1];
              s[p1] = s[p2];
              s[p2] = temp;
              p1++;
              p2--;
            }

            start = end + 1;
            end = start;
        }

        System.out.println(Arrays.toString(s));
    }
}
