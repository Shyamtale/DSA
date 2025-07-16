public class ith {
    public static int ithele(int n ,int i){
      int bitmask=1<<i;
      return (n & bitmask)==0?0:1;
    }
    public static void main(String[] args) {
        int n=13;
        int i=2;
        int bit =ithele(n,i);
        System.out.print("the"+i+"th bit is"+bit);
    }
}