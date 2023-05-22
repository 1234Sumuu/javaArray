public class maxElementFinder{
  public static int findMaxNumber(string[] arg){
    int[] nums = { 4, 3, 7, 0, 9, 4};
    int max = nums[0];
    
    for(int i = 0; i < nums.length; i++){
      if(nums[i] > max){
        max = nums[i];
      }
    }
    System.out.println("The max number is: " + max);
  }
}
