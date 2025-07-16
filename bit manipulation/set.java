public class set {



    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        int n = 10; 
        int i = 1;  

        int result = setIthBit(n, i);
        System.out.println("New number after setting bit: " + result);
    }
}
