public class kadane{

    public static int arrsu(int arr[]){
int maxsum=arr[0];
int currsum=arr[0];
for(int i=0;i<arr.length;i++){
     currsum=Math.max(arr[i],currsum+arr[i]);
     maxsum=Math.max(currsum,maxsum);


}
return maxsum;

    }

    public static void main(String args[]){

     int arr[]={1,-2,3,5,-3,7,9,0,6,-3,24,-67};

int result =arrsu(arr);
System.out.println(result);
    }
}