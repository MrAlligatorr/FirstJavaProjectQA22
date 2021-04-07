package lab2;

public class Main {
    static int x = 5;
    static int y = 2;

    public static void main(String[] args) {
        printName("Razvan");
        System.out.println("The solution for ex.1.2 = " + sum1(x, y));
        System.out.println("The solution for ex.1.3 = " + devide1(x, y));
        System.out.println("The solution for ex.1.4.a = " + sumMultiply1(-5, 8, 6));
        System.out.println("The solution for ex.1.4.b = " + sumModulo1(55, 9, 9));
        System.out.println("The solution for ex.1.4.c = " + sumMultiplyDevide1(20, -3, 5, 8));
        System.out.println("The solution for ex.1.4.d = " + ex14d(5, 15, 3, 2, 8, 3));
        System.out.println("The solution for ex.2 (+) = " + sum2(2.2f, 3));
        System.out.println("The solution for ex.2 (-) = " + substraction2(6, 4));
        System.out.println("The solution for ex.2 (*) = " + multiply2(2, 3));
        System.out.println("The solution for ex.2 (/) = " + divide2(6, 2));
        printProgramName("The solution for ex.3:");
        System.out.println("The solution for ex.4 = " + averageNumber(3, 2, 4));
        printFace("The solution for ex.5:");
        System.out.println("The solution for ex.6 = " + decimalPoint(5, 2));
        System.out.println("The solution for ex.7 = " + convertCToF(20));
        System.out.println("The solution for ex.8 = " + convertInchToM(4524));
        speed(8589234, 3, 24, 36);
    }

    //Ex 1.1
    public static void printName(String name) {
        System.out.println("The solution for ex.1.1 = Hello " + name + "!");
    }

    // Ex 1.2
    public static float sum1(float first, float second) {
        float sum = first + second;
        return sum;
    }

    //Ex 1.3
    public static float devide1(float first, float second) {
        float devide1 = first / second;
        return devide1;
    }

    //Ex 1.4.a
    public static int sumMultiply1(int first, int second, int third) {
        int suMultiply1 = first + second * third;
        return suMultiply1;
    }

    //Ex 1.4.b
    public static int sumModulo1(int first, int second, int third) {
        int sumModulo1 = (first + second) % third;
        return sumModulo1;
    }

    //Ex 1.4.c
    public static float sumMultiplyDevide1(float first, float second, float third, float four) {
        float sumMultiplyDevide1 = first + second * third / four;
        return sumMultiplyDevide1;
    }

    //Ex 1.4.d
    public static int ex14d(int a, int b, int c, int d, int e, int f) {
        int ex14d = a + b / c * d - e % f;
        return ex14d;
    }

    //Ex 2
    public static float sum2(float first, float second) {
        float sum2 = first + second;
        return sum2;
    }

    public static float substraction2(float first, float second) {
        float substraction2 = first - second;
        return substraction2;
    }

    public static float multiply2(float first, float second) {
        float multiply2 = first * second;
        return multiply2;
    }

    public static float divide2(float first, float second) {
        float divide2 = first / second;
        return divide2;
    }

    //Ex 3
    public static void printProgramName(String exercise) {
        System.out.println(exercise);
        System.out.println("   J    A    V     V    A   ");
        System.out.println("   J   A A    V   V    A A  ");
        System.out.println("J  J  AAAAA    V V    AAAAA ");
        System.out.println(" JJ  A     A    V    A     A");
    }

    //Ex 4
    public static float averageNumber(float first, float second, float third) {
        float averageNumber = (first + second + third) / 3;
        return averageNumber;
    }

    //Ex 5
    public static void printFace(String exercise) {
        System.out.println(exercise);
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +-----+ ");
    }

    //Ex 6
    public static int decimalPoint(int first, int second) {
        int result = first % second;
        return result;
    }

    //Ex 7
    public static float convertCToF(float temp) {
        float Fahrenheit = (9 * temp + 160) / 5;
        return Fahrenheit;
    }

    //Ex 8
    public static float convertInchToM(float inch) {
        float meters = inch / 39.370f;
        return meters;
    }

    //Ex 9
    public static void speed(float meters, int hours, int minutes, int seconds) {
        float time = seconds + minutes * 60 + hours * 60 * 60;
        float metersPerSeconds = meters / time;
        float kilometersPerHours = (meters / 1000) / (time / 3600);
        float mphPerHours = (meters / 1609) / (time / 3600);
        System.out.println("The solution for ex.9: ");
        System.out.println("Speed (m/s) = " + metersPerSeconds);
        System.out.println("Speed (km/h) = " + kilometersPerHours);
        System.out.println("Speed (mph/h) = " + mphPerHours);
    }

}