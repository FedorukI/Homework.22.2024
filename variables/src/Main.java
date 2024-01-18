public class Main {
    public static void main(String[] args) {
        byte byteBox1 = 120;

        short shortBox1 = 300;

        shortBox1 = byteBox1;

        System.out.println(shortBox1);

        int intBox1 = 10000;

        long longBox1 = 5000;

        longBox1 = intBox1;

        System.out.println(longBox1);

        double doubleBox1 = 1.6;

        float floatBox = 22;

        doubleBox1 = floatBox;

        System.out.println(doubleBox1);

    }
}