import java.util.*;

public class Main {
    public static void sortTwoColors(int nums[]){
      int i =0;
      int j = nums.length -1;
      while(i<=j){
        if(nums[i]==0){
          i++;
        }else{
          // swapping of i and j
          int temp = nums[j];
          nums[j]=nums[i];
          nums[i]=temp;
          j--;


        }
      }
    }
    public static void main(String[] args) {
      int nums[]={0,1,1,1,0,0,1,1};

      System.out.println("Before:");
      for (int i = 0;i< nums.length-1;i++ ){
        System.out.print(nums[i]+ " ");
        
      } 
      System.out.println();
      System.out.println();
      sortTwoColors(nums);
      System.out.println("After:");
      for (int i = 0;i< nums.length-1;i++ ){
        System.out.print(nums[i]+ " ");
      }
    }
}

     
