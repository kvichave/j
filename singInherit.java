
class emp {
    float sal=60000;

}





public class singInherit extends emp {
    float bonus=5000;
    float temp=bonus+sal;

    public static void main(String[] args) {
        singInherit obj=new singInherit();
        System.out.println("Salary is : "+obj.sal);
        System.out.println("Salary after bonus is : "+obj.temp);
    }
    
    
}
