package sarah.cursomaratonajava.introducao;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //int double float char byte short long boolean
        int age = (int) 10000000000L; //casting
        long bigNumber = 100000;
        double payDouble = 5000;
        float payFloat = 5500.5F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean kids = false;
        char sex = 'M';

        String name = "A big text!";

        System.out.println("The age is " + age+ " years");
        System.out.println(kids);
        System.out.println(sex);
        System.out.println(name);


    }
}
