public class substring {

public static String substr(String str,int si,int ei){
    String subtr="";
    for(int i=si;i<ei;i++){
        subtr+=str.charAt(i);

    }
    return subtr;
}

    public static void main(String[] args) {
        String str="helloworld";
System.out.println(substr(str,0,5));  

//shortcut for the substring 
System.out.print(str.substring(0,5));

  }
}