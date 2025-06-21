public class reverse{

    public static void reversearr(int arr[]){
int start=0; int end=arr.length-1;
while(start<end){
 int temp = arr[start];
            arr[start] = arr[end]; 
            arr[end] = temp;
start++;
end--;
}

    }

public static void main(String args[]){
    int arr[]={1,2,4,5,6,7,8,9};
 reversearr(arr);
 for(int i: arr){
    System.out.print(i+ " ");
 }



}
}