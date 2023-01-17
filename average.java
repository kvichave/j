import java.util.Scanner;

class average{
    String sci,maths,eng,id;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter ID : ");
        String id=sc.nextLine();

        System.out.println("Enter Science marks : ");
        String sci=sc.nextLine();

        System.out.println("Enter Maths marks : ");
        String maths=sc.nextLine();

        System.out.println("Enter English marks : ");
        String eng=sc.nextLine();

        int A=Integer.parseInt(sci);
        int B=Integer.parseInt(maths);
        int C=Integer.parseInt(eng);
        int add=A+B+C;
        float avg=add/3;

        System.out.println("ID : "+id+"\nThe average got is : "+avg);





        
    } 
}