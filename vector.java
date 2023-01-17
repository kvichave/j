import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<String> vec=new Vector<String>(2);

        vec.addElement("Apple");
        vec.addElement("Mango");
        vec.addElement("Pear");

        System.out.println("Default Size is : "+vec.size());
        System.out.println("default capacity incremented is : "+vec.capacity());

        vec.setSize(9);

        vec.addElement("A");
        vec.addElement("B");

        System.out.println("Size after addition is : "+vec.size());
        System.out.println("Vector capacity after increment is : "+vec.capacity());


        
    }
    
}
