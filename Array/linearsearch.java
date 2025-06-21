 public class linearsearch{

public static void linear(int arr[],int key){
    for(int i =0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.print("index of the key element "+i);
        }
    }
}
public static void main(String args[]){

    int arr[]={1,2,4,3,5,6,7,8};
    int key=7;
linear(arr,key);
}



}