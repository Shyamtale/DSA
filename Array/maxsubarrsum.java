
public class maxsubarrsum{

public static void summ(int arr[]){
int currsum=0;
int maxsum=Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        currsum=0;
        for(int k=i;k<=j;k++){
            
          currsum+=arr[k] ;
        }
        System.out.print(currsum);
        if(maxsum<currsum){
            maxsum=currsum;
        }
        System.out.println();
    }
}
System.out.println("max sum is " +maxsum);
}

public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
    summ(arr);
}

}

//brute force 
//brute force
