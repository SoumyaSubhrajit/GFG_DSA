package Arrays_Basic_level;

public class Minimum_Product_of_k_Integers {
    // Complete the function

    Arrays.sort(arr);

    long min = 1;

    for(int i = 0;i<k;i++){

        min = min*arr[i]% 1000000007;

    }

    return (int)min;
} 
}
