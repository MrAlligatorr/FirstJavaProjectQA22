package lab7;

public class Main {
    public static void main(String[] args) {
        LogicalOP op = new LogicalOP();
        Read rd = new Read();

        //Ex 1
//        System.out.println(op.sum());


        //Ex 2
//        System.out.println(op.sumFloat());
//        System.out.println(op.sumDouble());
//        System.out.println(op.sumLong());


        //Ex 3
//        op.printArray(op.populateArray(3));


        //Ex 4
//        op.printArray(op.setArray());


        //Ex 5
        int[] array = new int[5];
        array[0] = 15;
        array[1] = 4;
        array[2] = 21;
        array[3] = 18;
        array[4] = 9;

//        op.checkNumberFromIndex(array);
        //Sau
//        op.checkNumberFromIndex(array, rd.getIndex());


        //Ex 6
//        op.wait(rd.getInt());
    }
}
