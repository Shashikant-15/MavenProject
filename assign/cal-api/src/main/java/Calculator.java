public class Calculator {

    //public class Main{

    public static void main(String[] args) {
        int a = addition(5, 4);
        int b = subtraction(3, 2);
        int c = multiplication(5,6);
        int d = division(8, 1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static int addition(int tal1, int tal2) {
        return tal1 + tal2;
    }

    public static int subtraction(int tal1, int tal2) {
        return tal1 - tal2;
    }
    public static int multiplication(int tal1, int tal2) {
        return tal1 * tal2;
    }
    public static int division(int tal1, int tal2){
        return tal1 / tal2;
    }
}



