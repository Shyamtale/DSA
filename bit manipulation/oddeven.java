public class oddeven {
    public static void oddeve(int n ){
        int bitmask=1;
        if((n & bitmask)==0){
          
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddeve(3);
    }
}