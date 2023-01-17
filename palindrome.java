import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str,rev="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        str=sc.next();
        int len=str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("the string is palindrome : "+rev);
        }
        else{
            System.out.println("the string is not palindrome : "+rev);
        }

    }
    
}
