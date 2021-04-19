package remakeHomework.lab3IfElse;

public class Main {
    public static void main(String[] args) {
        CalculatorRemake calc = new CalculatorRemake();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.divide(5, 2f));
        System.out.println(calc.minus(5, 2));
        System.out.println(calc.multiply(2, 3));
        System.out.println(calc.average(2, 6, 7));
        System.out.println(calc.decimal(5,2));

        LogicalOPRemake op = new LogicalOPRemake();
        System.out.println(op.checkBiggerNumber(40,20));
        System.out.println(op.verify("FastTrackIT"));
        System.out.println(op.verify(" FastTrackIT ", 7));
        System.out.println(op.snow(9));
        System.out.println(op.ex7(6));
        op.ex8(87);
        System.out.println(op.isNumberEven(4));
        System.out.println(op.isEligibleToVote(19));
        System.out.println(op.checkBiggerNumber(6, 6, 6));
    }
}
