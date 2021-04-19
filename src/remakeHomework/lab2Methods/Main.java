package remakeHomework.lab2Methods;

public class Main {
    public static void main(String[] args) {
        printName("Razvan");
        System.out.println(sum(1, 2));
        System.out.println(divide(5, 2f));
        ex1(-5, 8, 6);
        ex2(55, 9, 9);
        ex3(20, -3, 5, 8);
        ex4(5, 15, 3, 2, 8, 3);
        System.out.println(minus(5, 2));
        System.out.println(multiply(2, 3));
        printJava();
        System.out.println(average(2, 6, 7));
        printFace();
        System.out.println(decimal(5,2));
        System.out.println(celsius(68));
        System.out.println(meters(8));
        transform(8589234, 3, 24, 36);
    }

    public static void printName(String name) {
        System.out.println("Hello " + name);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static float divide(int x, float y) {
        return x / y;
    }

    public static void ex1(int x, int y, int z) {
        System.out.println(x + y * z);
    }

    public static void ex2(int x, int y, int z) {
        System.out.println((x + y) % z);
    }

    public static void ex3(int x, int y, int z, float a) {
        System.out.println(x + y * z / a);
    }

    public static void ex4(int x, int y, int z, int a, int b, int c) {
        System.out.println(x + y / z * a - b % c);
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void printJava() {
        System.out.println(
                """
                           J    A     V     V     A   \s
                           J   A A     V   V     A A  \s
                        J  J  AAAAA     V V     AAAAA \s
                         JJ  A     A     V     A     A""");
    }

    public static float average(int x, int y, int z) {
        return ((x + y + z) / 3f);
    }

    public static void printFace() {
        System.out.println("""
                 +""\"""+\s
                [| o o |]\s
                 |  ^  |\s
                 | '_' |\s
                 +-----+ 
                """);
    }

    public static int decimal(int x, int y) {
        return x % y;
    }

    public static float celsius (float fah){
        return 5/9f*(fah-32);
    }

    public static float meters (int inch){
return (inch * 2.54f)/100;
    }

    public static void transform (float meters, int hours, int minutes, int seconds){
        int time = hours*3600+minutes*60+seconds;
        System.out.println(meters/time);
        System.out.println((meters/100)/(time/3600f));
        System.out.println((meters/1609)/(time/3600f));
    }
}
