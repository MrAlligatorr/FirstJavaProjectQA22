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
    public float average(int[] array) {
        int sum = 0;
        float md = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            sum = sum + array[i];
        }
        md = sum / (float) array.length;
        return md;
    }

    //Ex 5
    public Boolean trueOrFalse(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == text) {
                return true;
            }
        }
        return false;
    }

    //Ex6
    public int position(int[] rtn, int nr) {
        rtn[0] = 36;
        rtn[1] = 23;
        rtn[2] = 73;
        rtn[3] = 35;
        rtn[4] = 55;
        rtn[5] = 76;
        rtn[6] = 86;
        int loop = 0;
        for (int i = 0; i < 7; i++) {
            if (rtn[i] == nr) {
                loop = i;
            }
        }
        return loop;
    }

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

    //Ex 8
    public void verify(int[] array, int nr) {
        array[0] = 43;
        array[1] = 98;
        array[2] = 2;
        array[3] = 6;
        array[4] = 25;
        int loop = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] == nr) {
                loop = i;
            }
        }
        for (int j = 0; j < 5; j++) {
            if (j == loop) {
                j++;
            }
            System.out.println(array[j]);
        }
    }
}