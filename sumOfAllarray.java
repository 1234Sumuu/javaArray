public class sumOfArray{
  public static void main(String[] args){
    int[] numbers = {4, 3, 6, 9, 2};
    int sum = 0;
    
    for(int i =0; i < numbers.length; i++){
      sum += numbers[i];
    }
    System.out.println("Total Sum: "+ sum);
  }
}
