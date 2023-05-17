package Arrays_Basic_level;

public class Largest_product_in_subArray {
  long findMaxProduct(int A[], int n, int k)
  {
// Your code here
long winMul = 1;
   long maxMul = 1;

for(int i=0;i<k;i++){
    winMul *= A[i];
}
maxMul = winMul;
for(int i=k; i<A.length; i++){
    winMul = (winMul / A[i-k]) * A[i];
  maxMul = Math.max(maxMul , winMul);    
}
return maxMul;
  }
}
