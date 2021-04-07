package lab3;

public class Calculator {

    //Ex 1.1
    public void printName(String name) {
        System.out.println("The solution for ex.1.1 = Hello " + name + "!");
    }

    // Ex 1.2
    public float sum1(float first, float second) {
        return first + second;
    }

    //Ex 1.3
    public float devide1(float first, float second) {
        return first / second;
    }

    //Ex 1.4.a
    public int sumMultiply1(int first, int second, int third) {
        return first + second * third;
    }

    //Ex 1.4.b
    public int sumModulo1(int first, int second, int third) {
        return (first + second) % third;
    }

    //Ex 1.4.c
    public float sumMultiplyDevide1(float first, float second, float third, float four) {
        return first + second * third / four;
    }

    //Ex 1.4.d
    public int ex14d(int a, int b, int c, int d, int e, int f) {
      return a + b / c * d - e % f;
    }

    //Ex 2
    public float sum2(float first, float second) {
        return first + second;
    }

    public float substraction2(float first, float second) {
        return first - second;
    }

    public float multiply2(float first, float second) {
        return first * second;
    }

    public float divide2(float first, float second) {
        return first / second;
    }

    //Ex 3
    public void printProgramName(String exercise) {
        System.out.println(exercise);
        System.out.println("   J    A    V     V    A   ");
        System.out.println("   J   A A    V   V    A A  ");
        System.out.println("J  J  AAAAA    V V    AAAAA ");
        System.out.println(" JJ  A     A    V    A     A");
    }

    //Ex 4
    public float averageNumber(float first, float second, float third) {
        return (first + second + third) / 3;
    }

    //Ex 5
    public void printFace(String exercise) {
        System.out.println(exercise);
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +-----+ ");
    }

    //Ex 6
    public int decimalPoint(int first, int second) {
        return first % second;
    }

    //Ex 7
    public float convertCToF(float temp) {
        return (9 * temp + 160) / 5;
    }

    //Ex 8
    public float convertInchToM(float inch) {
        return inch / 39.370f;
    }

    //Ex 9
    public void speed(float meters, int hours, int minutes, int seconds) {
        float time = seconds + minutes * 60 + hours * 60 * 60;
        float metersPerSeconds = meters / time;
        float kilometersPerHours = (meters / 1000) / (time / 3600);
        float mphPerHours = (meters / 1609) / (time / 3600);
        System.out.println("The solution for ex.1.9: ");
        System.out.println("Speed (m/s) = " + metersPerSeconds);
        System.out.println("Speed (km/h) = " + kilometersPerHours);
        System.out.println("Speed (mph/h) = " + mphPerHours);
    }
}
