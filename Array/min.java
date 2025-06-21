public class min{

public static int minarray(int arr[]){
int min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    if(min>i){
        min=arr[i];
    }
}
return min;
}

public static void main(String args[]){

int arr[]={1,2,3,4,5,6,7,8,9};
int result=minarray(arr);
System.out.print("min of the array "+result);


    }
}