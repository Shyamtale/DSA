public class sum{

public static  int arraysum(int arr[]){

int sum=0;
for(int i: arr){
    sum+=i;
    }
return sum;
}


public static void main(String args[]){

int arr[]={1,2,3,4,5,6,7,8};

int result=arraysum(arr);
System.out.print("sum of the array: "+result);
}

}