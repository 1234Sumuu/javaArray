public class kadanesAlgo{
  public Static int[] findMaxSubArraySum(int[] arr){
    int maxSoFar = arr[0];
    int maxEndingHere = arr[0];
    int start = 0;
    int end = 0;
    
    for(int i = 0; i < arr.length -1; i++){
      maxEndingHere = Math.max(arr[i], maxEndingHere arr[i]);
      
      if(maxEndingHere > maxSoFar){
        maxSoFar = maxEndingHere;
        end = i;
      }
      if(maxEndingHere <0){
        start = i + 1;
      }
    }
    int[] maxSubarray = new int[end - start + 1];
        System.arraycopy(arr, start, maxSubarray, 0, maxSubarray.length);
        
    return maxSubarray;
  }
  public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        int[] maxSubarray = findMaxSubarraySum(arr);
        
        System.out.println("Maximum Subarray Sum: " + Arrays.stream(maxSubarray).sum());
        System.out.println("Subarray: " + Arrays.toString(maxSubarray));
    }
}
