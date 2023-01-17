public class trycatch {
   public static void main(String[] args) {
    try{
        int a=30/0;
    }
    catch(ArithmeticException e){
        System.out.println("an Arithmetic Exception occured");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("an Array Index Out Of Bounds Exception occured");
    }
    catch(Exception e){
        System.out.println("an parent exception occured");
    }

   } 
}
