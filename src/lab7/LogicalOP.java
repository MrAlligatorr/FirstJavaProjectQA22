package lab7;

public class LogicalOP {
    Read gN = new Read();

    //Ex 1
    public int sum() {
        return gN.getInt() + gN.getInt();
    }

    //Ex 2
    public float sumFloat() {
        return gN.getFloat() + gN.getFloat();
    }

    public double sumDouble() {
        return gN.getDouble() + gN.getDouble();
    }

    public long sumLong() {
        return gN.getLong() + gN.getLong();
    }

    //Ex 3
    public int[] populateArray(int nr1) {
        int[] array = new int[nr1];
        for (int i = 0; i < array.length; i++) {
            array[i] = gN.getValueFromIndex(i);
        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }

    //Ex 4
    public int[] setArray() {
        int[] array = new int[gN.getIndex()];
        for (int i = 0; i < array.length; i++) {
            array[i] = gN.getValueFromIndex(i);
        }
        return array;
    }

    //Ex 5
    public void checkNumberFromIndex(int[] array) {
        boolean repeat;
        do {
            try {
                System.out.println("The number is: " + array[gN.getIndex()]);
                repeat = false;
            } catch (ArrayIndexOutOfBoundsException a) {
                repeat = true;
                System.out.println("Inside catch, number too large");
            }
        } while (repeat);
    }

    //Sau

    public void checkNumberFromIndex(int[] array, int nr1) {
        try {
            System.out.println("The number is: " + array[nr1]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Inside catch, number too large");
        }
    }

    //Ex 6
    public void wait(int nr1) {
        try {
            Thread.sleep(nr1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Done");
        }
    }
}
