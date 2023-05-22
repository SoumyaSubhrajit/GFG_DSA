package Arrays_Basic_level;

public class Sum_Array_Puzzle {
  public static void SumArray(int arr[], int n)
    {
        
        for(int i=0; i<n; i++)
        {int sum = 0;
            for(int j =0; j<n; j++)
            {
                if(i == j)
                {
                continue;
                }
                else{
                    sum +=arr[j];
                }
            }
             System.out.print(sum+" ");
        }
    } 
}
