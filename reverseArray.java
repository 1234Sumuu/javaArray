import java.util.Arrays;

public class ArrayReverse{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    
      System.out.println("Array list are: " + Arrays.toString(arr));
      reverseArray(arr);
    
      System.out.println("Reverse array list are: " + reverseArray(arr));
  }
  public static void reverseArray(int[] arr){
    int Start = 0;
    int end = arr.length-1;
    
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      
      start++;
      end--;
    }
  }
}
