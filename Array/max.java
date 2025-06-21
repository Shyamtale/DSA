public class max{
public static int  maxele(int arr[],int max){
for(int i=0;i<arr.length;i++){
    if(i>max){
max=arr[i];

    }
}
return max;

}


public static void main (String args[]){
int arr[]={2,3,4,5,6,7,8,9};
int max=0;
int result=maxele(arr,max);
System.out.print("maximum element in array is "+result);

}

}