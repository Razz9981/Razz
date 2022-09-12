public class Demo {
    public void calculate(int a, int b) {
        int d = a / b;
        int c = a * b;
        System.out.println(c + d);
    }

    public static void main(String[] args) {
        Demo c = new Demo();
        c.calculate(12, 22);

    }
}
