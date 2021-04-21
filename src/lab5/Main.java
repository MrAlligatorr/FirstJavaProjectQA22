package lab5;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        LogicalOP op = new LogicalOP();

        //Ex 1
//        cal.printName("Razvan");
//        cal.printName("Andreica", " Razvan");
//        cal.printName("Andreica", " Razvan", " Liviu");

//        System.out.println(cal.sum(2, 3));
//        System.out.println(cal.sum(2, 3, 5));
//        System.out.println(cal.sum(1.1f, 1.5f));

//        System.out.println(cal.divide(6,2));
//        System.out.println(cal.divide(6.6f,3.3f));
//        System.out.println(cal.divide(12,6,2));

//        System.out.println(cal.sumMultiply(-5, 8, 6));
//        System.out.println(cal.sumMultiply(-5.2f, 8.2f, 6.2f));
//        System.out.println(cal.sumMultiply(-5, 8, 6, 2));

//        System.out.println(cal.sumModulo(55, 9, 9));
//        System.out.println(cal.sumModulo(55.5f, 9.3f, 9.8f));
//        System.out.println(cal.sumModulo(55, 9, 9, 10));

//        System.out.println(cal.sumMultiplyDivide(20.5f, -3.3f, 5.2f, 8.9f));
//        System.out.println(cal.sumMultiplyDivide(20, -3, 5, 8));
//        System.out.println(cal.sumMultiplyDivide(20.5f, -3.3f, 5.2f, 8.9f, 7.2f));

//        System.out.println(cal.sumDivideMultiplyMinusModulo(5, 15, 3, 2, 8, 3));
//        System.out.println(cal.sumDivideMultiplyMinusModulo(5.2f, 15.6f, 3.2f, 2.7f, 8.3f, 3.7f));
//        System.out.println(cal.sumDivideMultiplyMinusModulo(5, 15, 3, 2, 8, 3, 8));

//        System.out.println(cal.subtraction(6.2f, 4.1f));
//        System.out.println(cal.subtraction(6, 4));
//        System.out.println(cal.subtraction(6, 4,7));

//        System.out.println(cal.multiply(2.5f, 3.8f));
//        System.out.println(cal.multiply(2, 3));
//        System.out.println(cal.multiply(2, 3,6));

//        System.out.println(cal.averageNumber(3.2f, 2.5f, 4.2f));
//        System.out.println(cal.averageNumber(3.2f, 2.5f, 4.3f, 7.5f));
//        System.out.println(cal.averageNumber(2.2f, 4.4f));

//        System.out.println(cal.decimalPoint(5, 2));
//        System.out.println(cal.decimalPoint(5, 2,7));
//        System.out.println(cal.decimalPoint(5, 2,7,4));

//        System.out.println(cal.convertCToF(20.5f));
//        System.out.println(cal.convertCToF(20));

//        cal.speed(8589234.5f, 3, 24, 36);
//        cal.speed(8589234, 3, 24, 36);

        //Ex 2
//        int[] array2 = new int[100];
//        op.doBoth(array2);

        //Ex 3
//        int sizeArray = op.verifyIfEven(170);;
//        int[] array3 = new int[sizeArray+2];
//        op.printArrayEven(op.evenNumbers(array3));

        //Ex 4
//        int number =10;
//        int[] array = new int[number+1];
//        System.out.println(op.average(array));

        //Ex 5
//        String[] array = {"asdsad"};
//        System.out.println(op.verifyIfFound(array));

        //Ex 6
//        System.out.println(op.verifyIfFound(222));

        //Ex 7 (Aici am vrut sa se printeze emojiul ( OwO ))
//        String[] array = new String[5];
//        array[0] = "( ";
//        array[1] = "O";
//        array[2] = "w";
//        array[3] = "O";
//        array[4] = " )";
//        op.emote(array);

        //Ex 8
//        int number = 10;
//        int[] array = new int[number + 1];
//        op.exclusion(array, 8);

        //Ex 9
//        int number = 10;
//        int[] array = new int[11];
//        array[0] =531;
//        array[1] =257;
//        array[2] =715;
//        array[3] =509;
//        array[4] =366;
//        array[5] =111;
//        array[6] =9;
//        array[7] =541;
//        array[8] =516;
//        array[9] =2;
//        array[10] =839;
//        System.out.println(op.checkLower(array));

        //Ex 10
//        int[] array1 = {62,5,34,42,26,78,13,69,28,79};
//        int[] array2 = new int[array1.length];
//       op.printArray(op.copy(array1, array2));

        //Ex 1 Optional
//        int[] array = new int[10];
//        op.insert(array,5,90);
//        System.out.println(array[5]);

        //Ex 2 Optional
//        int[] array = new int[10];
//        array[0] = 78;
//        array[1] = 35;
//        array[2] = 18;
//        array[3] = 45;
//        array[4] = 2;
//        array[5] = 55;
//        array[6] = 11;
//        array[7] = 77;
//        array[8] = 66;
//        array[9] = 17;
//        op.findSmallerAndBigger(array);

        //Ex 3 Optional
//        int[] array = new int[10];
//        array[0]=2;
//        array[1]=11;
//        array[2]=22;
//        array[3]=33;
//        array[4]=44;
//        array[5]=55;
//        array[6]=66;
//        array[7]=77;
//        array[8]=88;
//        array[9]=99;
//        op.printArray(op.reverse(array));

        //Ex 4 Optional
//        int[] array = new int[10];
//        array[0] = 23;
//        array[1] = 23;
//        array[2] = 44;
//        array[3] = 55;
//        array[4] = 66;
//        array[5] = 77;
//        array[6] = 77;
//        array[7] = 88;
//        array[8] = 99;
//        array[9] = 44;
//        op.duplicatesInArray(array);

        //Ex 5 Optional
//        String[] arrayA = new String[10];
//        arrayA[0] = "Arachne";
//        arrayA[1] = "Arethusa";
//        arrayA[2] = "Laokoon";
//        arrayA[3] = "Theano";
//        arrayA[4] = "Poseidon";
//        arrayA[5] = "Jocasta";
//        arrayA[6] = "Pan";
//        arrayA[7] = "Euphrosyne";
//        arrayA[8] = "Phoebus";
//        arrayA[9] = "Lyssa";
//
//        String[] arrayB = new String[15];
//        arrayB[0] ="Arachne";
//        arrayB[1] ="Aoede";
//        arrayB[2] ="Apollo";
//        arrayB[3] ="Ianthe";
//        arrayB[4] ="Phoebus";
//        arrayB[5] ="Aineias";
//        arrayB[6] ="Perseus";
//        arrayB[7] ="Sparklesprig";
//        arrayB[8] ="Lykourgos";
//        arrayB[9] ="Poseidon";
//        arrayB[10] ="Hippolyta";
//        arrayB[11] ="Hemera";
//        arrayB[12] ="Demophon";
//        arrayB[13] ="Antigone";
//        arrayB[14] ="Atalanta";
//
//        op.common(arrayA,arrayB);


        //Ex 6 Optional
//        int[] array = new int[10];
//        array[0] = 70;
//        array[1] = 30;
//        array[2] = 90;
//        array[3] = 20;
//        array[4] = 50;
//        array[5] = 10;
//        array[6] = 100;
//        array[7] = 80;
//        array[8] = 40;
//        array[9] = 60;
//        op.printArray(op.reorganise(array));
    }


}
