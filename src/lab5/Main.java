package lab5;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        LogicalOP op = new LogicalOP();

        //Ex 1
//        cal.printName("Razvan");
//        cal.printName("Andreica", " Razvan");
//        cal.printName("Andreica", " Razvan", " Liviu");
//
//        System.out.println(cal.sum(2, 3));
//        System.out.println(cal.sum(2, 3, 5));
//        System.out.println(cal.sum(1.1f, 1.5f));
//
//        System.out.println(cal.divide(6,2));
//        System.out.println(cal.divide(6.6f,3.3f));
//        System.out.println(cal.divide(12,6,2));
//
//        System.out.println(cal.sumMultiply(-5, 8, 6));
//        System.out.println(cal.sumMultiply(-5.2f, 8.2f, 6.2f));
//        System.out.println(cal.sumMultiply(-5, 8, 6, 2));
//
//        System.out.println(cal.sumModulo(55, 9, 9));
//        System.out.println(cal.sumModulo(55.5f, 9.3f, 9.8f));
//        System.out.println(cal.sumModulo(55, 9, 9, 10));
//
//        System.out.println(cal.sumMultiplyDivide(20.5f, -3.3f, 5.2f, 8.9f));
//        System.out.println(cal.sumMultiplyDivide(20, -3, 5, 8));
//        System.out.println(cal.sumMultiplyDivide(20.5f, -3.3f, 5.2f, 8.9f, 7.2f));
//
//        System.out.println(cal.sumDivideMultiplyMinusModulo(5, 15, 3, 2, 8, 3));
//        System.out.println(cal.sumDivideMultiplyMinusModulo(5.2f, 15.6f, 3.2f, 2.7f, 8.3f, 3.7f));
//        System.out.println(cal.sumDivideMultiplyMinusModulo(5, 15, 3, 2, 8, 3, 8));
//
//        System.out.println(cal.subtraction(6.2f, 4.1f));
//        System.out.println(cal.subtraction(6, 4));
//        System.out.println(cal.subtraction(6, 4,7));
//
//        System.out.println(cal.multiply(2.5f, 3.8f));
//        System.out.println(cal.multiply(2, 3));
//        System.out.println(cal.multiply(2, 3,6));
//
//        System.out.println(cal.averageNumber(3.2f, 2.5f, 4.2f));
//        System.out.println(cal.averageNumber(3.2f, 2.5f, 4.3f, 7.5f));
//        System.out.println(cal.averageNumber(2.2f, 4.4f));
//
//        System.out.println(cal.decimalPoint(5, 2));
//        System.out.println(cal.decimalPoint(5, 2,7));
//        System.out.println(cal.decimalPoint(5, 2,7,4));
//
//        System.out.println(cal.convertCToF(20.5f));
//        System.out.println(cal.convertCToF(20));
//
//        cal.speed(8589234.5f, 3, 24, 36);
//        cal.speed(8589234, 3, 24, 36);

        //Ex 2
//        int[] arrayEx2 = new int[50];
//        op.doBoth(arrayEx2);
        //Sau
//        int min = 30;
//        int max = 50;
//        int size = max-min+1;
//        int[] arrayEx2V2 = new int[size];
//        op.doBoth(arrayEx2V2, 30, 50);

        //Ex 3
//        int sizeArray = op.verifyIfEven(170);
//        int[] arrayEx3 = new int[sizeArray + 2];
//        op.printArrayEven(op.evenNumbers(arrayEx3));

        //Ex 4
//        int number = 4;
//        int[] arrayEx4 = new int[number + 1];
//        System.out.println(op.average(arrayEx4));

        //Ex 5
//        String[] arrayEx5 = {"asdsad"};
//        System.out.println(op.verifyIfFound(arrayEx5));

        //Ex 6
//        System.out.println(op.verifyIfFound(222));

        //Ex 7 (Aici am vrut sa se printeze emojiul ( OwO ))
//        String[] arrayEx7 = new String[5];
//        arrayEx7[0] = "( ";
//        arrayEx7[1] = "O";
//        arrayEx7[2] = "w";
//        arrayEx7[3] = "O";
//        arrayEx7[4] = " )";
//        op.emote(arrayEx7);

        //Ex 8
//        int numberEx8 = 10;
//        int[] arrayEx8 = new int[numberEx8 + 1];
//        op.exclusion(arrayEx8, 8);

        //Ex 9
//        int numberEx9 = 10;
//        int[] arrayEx9 = new int[numberEx9 + 1];
//        arrayEx9[0] = 531;
//        arrayEx9[1] = 257;
//        arrayEx9[2] = 715;
//        arrayEx9[3] = 509;
//        arrayEx9[4] = 366;
//        arrayEx9[5] = 111;
//        arrayEx9[6] = 9;
//        arrayEx9[7] = 541;
//        arrayEx9[8] = 516;
//        arrayEx9[9] = 2;
//        arrayEx9[10] = 839;
//        System.out.println(op.checkLower(arrayEx9));

        //Ex 10
//        int[] arrayEx10V1 = {62, 5, 34, 42, 26, 78, 13, 69, 28, 79};
//        int[] arrayEx10V2 = new int[arrayEx10V1.length];
//        op.printArray(op.copy(arrayEx10V1, arrayEx10V2));

        //Ex 1 Optional
//        int[] arrayEx1Op = new int[10];
//        op.insert(arrayEx1Op, 5, 90);
//        System.out.println(arrayEx1Op[5]);

        //Ex 2 Optional
//        int[] arrayEx2Op = new int[10];
//        arrayEx2Op[0] = 78;
//        arrayEx2Op[1] = 35;
//        arrayEx2Op[2] = 18;
//        arrayEx2Op[3] = 45;
//        arrayEx2Op[4] = 2;
//        arrayEx2Op[5] = 55;
//        arrayEx2Op[6] = 11;
//        arrayEx2Op[7] = 77;
//        arrayEx2Op[8] = 66;
//        arrayEx2Op[9] = 17;
//        op.findSmallerAndBigger(arrayEx2Op);

        //Ex 3 Optional
//        int[] arrayEx3Op = new int[10];
//        arrayEx3Op[0] = 2;
//        arrayEx3Op[1] = 11;
//        arrayEx3Op[2] = 22;
//        arrayEx3Op[3] = 33;
//        arrayEx3Op[4] = 44;
//        arrayEx3Op[5] = 55;
//        arrayEx3Op[6] = 66;
//        arrayEx3Op[7] = 77;
//        arrayEx3Op[8] = 88;
//        arrayEx3Op[9] = 99;
//        op.printArray(op.reverse(arrayEx3Op));

        //Ex 4 Optional
//        int[] arrayEx4Op = new int[10];
//        arrayEx4Op[0] = 23;
//        arrayEx4Op[1] = 23;
//        arrayEx4Op[2] = 44;
//        arrayEx4Op[3] = 55;
//        arrayEx4Op[4] = 66;
//        arrayEx4Op[5] = 77;
//        arrayEx4Op[6] = 77;
//        arrayEx4Op[7] = 88;
//        arrayEx4Op[8] = 99;
//        arrayEx4Op[9] = 44;
//        op.duplicatesInArray(arrayEx4Op);

        //Ex 5 Optional
//        String[] arrayEx5OpA = new String[10];
//        arrayEx5OpA[0] = "Arachne";
//        arrayEx5OpA[1] = "Arethusa";
//        arrayEx5OpA[2] = "Laokoon";
//        arrayEx5OpA[3] = "Theano";
//        arrayEx5OpA[4] = "Poseidon";
//        arrayEx5OpA[5] = "Jocasta";
//        arrayEx5OpA[6] = "Pan";
//        arrayEx5OpA[7] = "Euphrosyne";
//        arrayEx5OpA[8] = "Phoebus";
//        arrayEx5OpA[9] = "Lyssa";
//
//        String[] arrayEx5OpB = new String[15];
//        arrayEx5OpB[0] = "Arachne";
//        arrayEx5OpB[1] = "Aoede";
//        arrayEx5OpB[2] = "Apollo";
//        arrayEx5OpB[3] = "Ianthe";
//        arrayEx5OpB[4] = "Phoebus";
//        arrayEx5OpB[5] = "Aineias";
//        arrayEx5OpB[6] = "Perseus";
//        arrayEx5OpB[7] = "Sparklesprig";
//        arrayEx5OpB[8] = "Lykourgos";
//        arrayEx5OpB[9] = "Poseidon";
//        arrayEx5OpB[10] = "Hippolyta";
//        arrayEx5OpB[11] = "Hemera";
//        arrayEx5OpB[12] = "Demophon";
//        arrayEx5OpB[13] = "Antigone";
//        arrayEx5OpB[14] = "Atalanta";
//
//        op.common(arrayEx5OpA, arrayEx5OpB);


        //Ex 6 Optional
//        int[] arrayEx6Op = new int[10];
//        arrayEx6Op[0] = 70;
//        arrayEx6Op[1] = 30;
//        arrayEx6Op[2] = 90;
//        arrayEx6Op[3] = 20;
//        arrayEx6Op[4] = 50;
//        arrayEx6Op[5] = 10;
//        arrayEx6Op[6] = 100;
//        arrayEx6Op[7] = 80;
//        arrayEx6Op[8] = 40;
//        arrayEx6Op[9] = 60;
//        op.printArray(op.reorganise(arrayEx6Op));
    }
}
