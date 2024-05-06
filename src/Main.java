

public class Main {
    public static void main(String[] args) {

        // Casting Explícito (Casting)

        int num1 =10; // 32 bits
        short num2 = (short) num1; // 16 bits

        long numL = 11111111111111L; //64 bits
        System.out.println(numL);
        int numI = (int) numL; // 32 bits
        System.out.println(numI);

        // Casting Implícito

        byte b =1;
        System.out.println(b);
        short s = b;
        System.out.println(s);

       int age = 20;
       long ageL = age;
       System.out.println(ageL);
    }
}