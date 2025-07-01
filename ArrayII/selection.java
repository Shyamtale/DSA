public class selection {
public static void selectionsort(int arr[]){
    for(int i=0;i<arr.length;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
}

public static void orin(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        int arr[]={1,3,4,5545645,56,56456454,34534,5675,23,45,67};

        selectionsort(arr);
        orin(arr);
    }
}