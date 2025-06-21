public class pair{
public static void pairr(int arr[]){
    for(int i:arr){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+")");
        }
    }
}

public static void main(String args[]){

int arr[]={1,2,3,4,5,6,7,8,9,10,11};

pairr(arr);

}


}