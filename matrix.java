import java.util.Scanner;

public class matrix {
   public static void main(String[] args) {
    int arr1[][]=new int[3][3];
    int arr2[][]=new int[3][3];
    int arr3[][]=new int[3][3];

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter data in First matrix : ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr1[i][j]=sc.nextInt();
        }
    }

    System.out.println("Enter data in Seconf matrix : ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr2[i][j]=sc.nextInt();
        }
    }

    System.out.println("Addition of first and second matrix is : ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr3[i][j]=arr1[i][j]+arr2[i][j];
            System.out.print(arr3[i][j]+" ");
        }
        System.out.println();

    }



   } 
}
