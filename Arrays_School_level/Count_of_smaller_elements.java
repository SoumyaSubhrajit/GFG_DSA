public class Count_of_smaller_elements {
  public long countOfElements(long arr[], long n, long x)
  {
      int count=0;
      for(int i=0;i<arr.length;i++){
          if(x>=arr[i]){
              count++;
          }
      }
      return count;
  }
}
