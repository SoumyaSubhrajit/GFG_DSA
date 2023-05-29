package Arrays_Basic_level;

public class Count_pair_sum {
   // function to count all pairs  
    // from both the sorted arrays  
    // whose sum is equal to a given  
    // value 
    static int countPairs(int arr1[],int arr2[], int M, int N, int x) 
    { 
        //////////  1st way....... ///////////
    //     int count = 0;
    //   for(int  i=0; i<M; i++)
    //   {
    //       for(int j=0; j<N; j++)
    //       {
    //           if(arr1[i] + arr2[j] == x)
    //           count++;
    //       }
    //   }
    //   return count;
    
    
    //////// 2nd way ///////////
    
    int count =0; int  i=0; int j = N-1;
    while(i<M && j>=0)
    {
        if(arr1[i] + arr2[j] == x){
        count++;
        i++;
        j--;
        }
        else if (arr1[i] + arr2[j] < x){
            i++;
        }
        else{
            j--;
        }
    }
   return count; 
   
    }
}
