public class secondlargest{

public static int seclar(int arr[]){
if(arr.length<2){
    System.out.print("array should contain at least two elements");
    return -1;
}
int first=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;

for(int i:arr){
    if(i>first){
        second=first;
        first=i;
    }else if(i>second && i!=first){
        second=i;
    }
}
return second;
}






public static void main (String args[]){
int arr[]={1,2,3,4,5,6,7,8,9};

int result =seclar(arr);
System.out.print("second largest element in the array is "+result);

}


}