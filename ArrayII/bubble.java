public class bubble {
public static void bubblesort(int arr[]){
    for(int turns=0;turns<arr.length;turns++){
        for(int j=0;j<arr.length-1-turns;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}


public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
}


    public static void main(String[] args) {
       int arr[]={34,56,7,4,3,576,8,}; 
       bubblesort(arr);
       printarr(arr);
    }
}


