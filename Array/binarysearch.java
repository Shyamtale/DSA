public class binarysearch{
     
     public static int binary(int arr[],int key){
        int start=0; int end=arr.length-1;
        while(start<=end){
             int mid=start+(end-start)/2;
            if(arr[mid]==key){
               return mid;
            }
          
            else if (arr[mid]<key){
            start=mid+1;
            }
           else{
           end=mid-1;
           }
        }
        return -1;
     }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int  key= 3;
        int result=binary(arr,key);
        System.out.print("index of the key element "+result);
    }
}