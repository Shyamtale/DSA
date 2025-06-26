public class prefixsumsub{

public static void summ(int arr[]){
int currsum=0;
int maxsum=Integer.MIN_VALUE;
int n=arr.length;
 

// Step 1: Create prefix sum array
int[] prefix = new int[n];
prefix[0] = arr[0];
for (int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}

for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
        
        if(maxsum<currsum){
            maxsum=currsum;
        }
        System.out.println();
    }
}
System.out.println("max sum is "+maxsum);
}

public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
    summ(arr);
}

}

// prefix sum 


