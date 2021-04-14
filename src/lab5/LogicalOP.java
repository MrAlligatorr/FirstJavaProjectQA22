package lab5;

public class LogicalOP {


    public void populateArrayWithValues(int[] array, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Ex 2
    public void countToMax(int[] array, int max) {
        for (int i = 0; i < max; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    //Ex 3
    public int[] evenNumbers(int[] array) {
        int start = 0;
        for (int i = 0; i < (array.length * 2 - 1); i++) {
            if (i % 2 == 0) {
                array[start] = i;
                start++;
            }
        }
        return array;
    }

    //Ex 4
//    public int[] ex4(int[] array) {
//        int i=0;
//            array[i] = i + 1;
//        }
//    }

    //Ex 7
    public void ex7(String[] array) {
        array = new String[10];
        array[0] = "- - - - - - - - - - ";
        array[1] = "- - - - - - - - - - ";
        array[2] = "- - - - - - - - - - ";
        array[3] = "- - - - - - - - - - ";
        array[4] = "- - - - - - - - - - ";
        array[5] = "- - - - - - - - - - ";
        array[6] = "- - - - - - - - - - ";
        array[7] = "- - - - - - - - - - ";
        array[8] = "- - - - - - - - - - ";
        array[9] = "- - - - - - - - - - ";
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}