public class MethodEx {

    static void sayHello() {
        System.out.println("Hello!");
    }

    static int add(int a, int b) {
        return a + b;

    }
    public static void main(String[] args) {
        sayHello();
        int result = add(10, 20);
        System.out.println("Sum = " + result);

    }
}