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
  }
}
