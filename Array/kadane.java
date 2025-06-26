public class kadane{

public static void kadan(int  arr[]){
int ms=Integer.MIN_VALUE;
int cs=0;
for(int i=0; i<arr.length;i++){
    cs=cs+arr[i];
    if(cs<0){
        cs=0;
    }
ms=Math.max(cs,ms);
}
System.out.print("our max subarray sum is "+ms);
}

public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
   kadan(arr);
}

}