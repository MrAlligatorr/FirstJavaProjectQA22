package lab5;

public class Calculator {
    //Ex 1
    public void printName(String name) {
        System.out.println("The solution for ex.1.1 = Hello " + name + "!");
    }

    public void printName(String name, String secondName) {
        System.out.println("The solution for ex.1.1 = Hello " + name + secondName + "!");
    }

    public void printName(String name, String secondName, String thirdName) {
        System.out.println("The solution for ex.1.1 = Hello " + name + secondName + thirdName + "!");
    }

    public int sum(int first, int second) {
        return first + second;
    }

    public int sum(int first, int second, int third) {
        return first + second + third;
    }

    public float sum(float first, float second) {
        return first + second;
    }

    public float divide(float first, float second) {
        return first / second;
    }

    public int divide(int first, int second) {
        return first / second;
    }

    public float divide(float first, float second, float third) {
        return first / second / third;
    }

    public int sumMultiply(int first, int second, int third) {
        return first + second * third;
    }

    public float sumMultiply(float first, float second, float third) {
        return first + second * third;
    }

    public int sumMultiply(int first, int second, int third, int forth) {
        return first + second + third * forth;
    }

    public int sumModulo(int first, int second, int third) {
        return (first + second) % third;
    }

    public float sumModulo(float first, float second, float third) {
        return (first + second) % third;
    }

    public int sumModulo(int first, int second, int third, int fourth) {
        return (first + second + third) % fourth;
    }

    public float sumMultiplyDivide(float first, float second, float third, float fourth) {
        return first + second * third / fourth;
    }

    public int sumMultiplyDivide(int first, int second, int third, int fourth) {
        return first + second * third / fourth;
    }

    public float sumMultiplyDivide(float first, float second, float third, float fourth, float fifth) {
        return first + second + third * fourth / fifth;
    }

    public int sumDivideMultiplyMinusModulo(int a, int b, int c, int d, int e, int f) {
        return a + b / c * d - e % f;
    }

    public float sumDivideMultiplyMinusModulo(float a, float b, float c, float d, float e, float f) {
        return a + b / c * d - e % f;
    }

    public int sumDivideMultiplyMinusModulo(int a, int b, int c, int d, int e, int f, int g) {
        return a + b + c / d * e - f % g;
    }

    public float subtraction(float first, float second) {
        return first - second;
    }

    public int subtraction(int first, int second) {
        return first - second;
    }

    public int subtraction(int first, int second, int third) {
        return first - second - third;
    }

    public float multiply(float first, float second) {
        return first * second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int multiply(int first, int second, int third) {
        return first * second * third;
    }

    public float averageNumber(float first, float second, float third) {
        return (first + second + third) / 3;
    }

    public float averageNumber(float first, float second, float third, float fourth) {
        return (first + second + third + fourth) / 4;
    }

    public float averageNumber(float first, float second) {
        return (first + second) / 2;
    }

    public int decimalPoint(int first, int second) {
        return first % second;
    }

    public int decimalPoint(int first, int second, int third) {
        return first % second % third;
    }

    public int decimalPoint(int first, int second, int third, int fourth) {
        return first % second % third % fourth;
    }

    public float convertCToF(float temp) {
        return (9 * temp + 160) / 5;
    }

    public int convertCToF(int temp) {
        return (9 * temp + 160) / 5;
    }

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

    public void speed(int meters, int hours, int minutes, int seconds) {
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
