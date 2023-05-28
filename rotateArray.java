import java.util.Arrays;

public class ArrayRotation(){
  public static void main(String[] args){
     int[] arr = {1, 2, 3, 4, 5};
     int rotationSteps = 2;
    
     System.out.println("Original Array: " + Array.toString(arr));
     rotateArray(arr, rotationSteps);
    
    System.out.println("Rotate Array: " + Arrays.toString(arr));
    
    public class rotateArray(int[] arr, int rotationSteps){
      int n = arr.lenth;
      rotationSteps = rotationSteps % n;
      
      reverseArray(arr, 0, n-1);
      reverseArray(arr, rotateSteps-1);
      reverseArray(arr, rotateSteps, n-1);
    }
    public static void reverseArray(int[] arr, int start, int end){
      while(start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        start++;
        end--;
      }
    }
  }
}
