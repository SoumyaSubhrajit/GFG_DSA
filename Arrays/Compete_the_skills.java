public class Compete_the_skills {
  public void scores(long a[], long b[]) {
    // store the answer as
    // GFG.ca=3;
    // GFG.cb=5;
    // Your code goes here
    int aCount=0;
    int bCount=0;
    for(int i =0; i<a.length;i++){
        if(a[i]>b[i]){
           aCount++; 
        }else if((a[i]<b[i])){
            bCount++;
        }
    }
    // GFG.ca=aCount;
    // GFG.cb=bCount;
}
  
}
