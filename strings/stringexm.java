import java.util.*;
public class stringexm {
public static void pall(String fullname){
    for(int i=0;i<fullname.length();i++){
    System.out.print(fullname.charAt(i)+" ");
    }
    
}

    public static void main(String[] args) {

        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
 String fullname="tony stark";
 pall(fullname);
        //Strings are immutable
        Scanner sc=new Scanner(System.in);
        String name;

        name=sc.nextLine();
        System.out.println(name);
        System.out.println(fullname.length());

        //concatination
        String first="shyam";
        String lastname="talekar";
        String result=first+" "+lastname;
        System.out.print(result.charAt(0));
    }
}

