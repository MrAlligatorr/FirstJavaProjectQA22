package lab3;

public class Main {
    static int x = 5;
    static int y = 2;

    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        calculate.printName("Razvan");
        System.out.println("The solution for ex.1.1.2 = " + calculate.sum1(x, y));
        System.out.println("The solution for ex.1.1.3 = " + calculate.devide1(x, y));
        System.out.println("The solution for ex.1.1.4.a = " + calculate.sumMultiply1(-5, 8, 6));
        System.out.println("The solution for ex.1.1.4.b = " + calculate.sumModulo1(55, 9, 9));
        System.out.println("The solution for ex.1.1.4.c = " + calculate.sumMultiplyDevide1(20, -3, 5, 8));
        System.out.println("The solution for ex.1.1.4.d = " + calculate.ex14d(5, 15, 3, 2, 8, 3));
        System.out.println("The solution for ex.1.2 (+) = " + calculate.sum2(2.2f, 3));
        System.out.println("The solution for ex.1.2 (-) = " + calculate.substraction2(6, 4));
        System.out.println("The solution for ex.1.2 (*) = " + calculate.multiply2(2, 3));
        System.out.println("The solution for ex.1.2 (/) = " + calculate.divide2(6, 2));
        calculate.printProgramName("The solution for ex.1.3:");
        System.out.println("The solution for ex.1.4 = " + calculate.averageNumberWith3(3, 2, 4));
        calculate.printFace("The solution for ex.1.5:");
        System.out.println("The solution for ex.1.6 = " + calculate.decimalPoint(5, 2));
        System.out.println("The solution for ex.1.7 = " + calculate.convertCToF(20));
        System.out.println("The solution for ex.1.8 = " + calculate.convertInchToM(4524));
        calculate.speed(8589234, 3, 24, 36);

        LogicalOP op = new LogicalOP();
        System.out.println("The solution for ex.3 = " + op.checkBiggerNumber(2, 3));
        System.out.println("The solution for ex.4 = " + op.learnTextComparison("FastTrackIT"));
        System.out.println("The solution for ex.5 = " + op.ex5("FastTrackIT ", 2));
        System.out.println("The solution for ex.6 = " + op.snow(1));
        System.out.println("The solution for ex.7 = " + op.ex7(5));
        System.out.print("The solution for ex.8 = ");
        op.switchCase(3);
        System.out.println("The solution for ex.9 = " + op.isNumberEven(5));
        System.out.println("The solution for ex.10 = " + op.isEligibleToVote(19));
        System.out.println("The solution for ex.11 =  "+ op.higherNumberWith3Numbers(23,55,22));
    }
}