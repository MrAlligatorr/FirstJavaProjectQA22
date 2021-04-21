package lab5;

public class LogicalOP {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printArraySpecial(int[] array, int nr1) {
        for (int i = 0; i < array.length; i++) {
            if (i == nr1) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    public void printArrayEven(int[] array) {
        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public void setArrayStart0(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public int verifyIfEven(int nr1) {
        if (nr1 % 2 == 0) {
            return nr1;
        }
        return 0;
    }

    //Ex 2
    public void doBoth(int[] array) {
        setArray(array);
        printArray(array);
    }

    //Ex 3
    public int[] evenNumbers(int[] array) {
        setArray(array);
        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i;
            }
        }
        return array;
    }

    //    Ex 4
    public float average(int[] array) {
        setArray(array);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
            count++;
        }
        return sum / (float) (array.length - 1);
    }

    //Ex 5
    public boolean verifyIfFound(String[] array) {
        String[] verify = new String[5];
        verify[0] = "Andreica";
        verify[1] = "Razvan";
        verify[2] = "Liviu";
        verify[3] = "Quality";
        verify[4] = "Assurance";

        for (int i = 0; i < array.length; i++) {
            for (int count = 0; count <= 4; count++) {
                if (array[i].equals(verify[count])) {
                    return true;
                }
            }
        }
        return false;
    }

    //Ex 6
    public int verifyIfFound(int nr1) {
        int[] array = new int[246];
        setArrayStart0(array);
        for (int i = 0; i <= 245; i++) {
            if (array[i] == nr1) {
                return i;
            }
        }
        System.out.print("The number does not exist in the array = ");
        return nr1;
    }

    //Ex 7
    public void emote(String[] array) {
        for (int y = 1; y <= 10; y++) {
            for (int z = 1; z <= 7; z++) {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
            }
            System.out.println();
        }
    }

    //Ex 8
    public int[] exclusion(int[] array, int nr1) {
        setArrayStart0(array);
        printArraySpecial(array, nr1);
        return array;
    }

    //Ex 9
    public int checkLower(int[] array) {
        int lower = array[0];
        for (int i = 0; i < array.length; i++) {
            if (lower > array[i]) {
                lower = array[i];
            }
        }
        return lower;
    }

    //Ex 10
    public int[] copy(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        return array2;
    }

    //Ex 1 Optional
    public int[] insert(int[] array, int index, int nr1) {
        array[index] = nr1;
        return array;
    }

    //Ex 2 Optional
    public void findSmallerAndBigger(int[] array) {
        int lower = array[0];
        int bigger = array[0];
        for (int i = 0; i < array.length; i++) {
            if (lower > array[i]) {
                lower = array[i];
            }
            if (bigger < array[i]) {
                bigger = array[i];
            }
        }
        System.out.println("The smaller number is: " + lower);
        System.out.println("The biggest number is: " + bigger);
    }

    //Ex 3 Optional
    public int[] reverse(int[] array) {
        int x = 0;
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        for (int y = arrayCopy.length - 1; y >= 0; y--) {
            array[x] = arrayCopy[y];
            x++;
        }
        return array;
    }

    //Ex 6 Optional
//    public int[] reorganise(int[] array) {
//        int[] fillArray = new int[array.length];
//        int a =1;
//        int lower = array[0];
//        for (int index = 0; index < array.length; index++) {
//            for (int checkSmall = 0; checkSmall < array.length; checkSmall++) {
//                if (lower > array[checkSmall]) {
//                    lower = array[checkSmall];
//                }
//            }
//            fillArray[index] = lower;
//            for (int count = 0; count < fillArray.length; count++) {
//                for (int secondCount=1; secondCount< fillArray.length;secondCount++){
//                if (fillArray[count] == fillArray[secondCount]){
//                        continue;
//                    }
//                }
//            }
//        }
//        return fillArray;
//    }
            //Ex 4 Optional
//    public void duplicateInArray (int[] array){
//        int nr1=0;
//        int nr2=0;
//        for (int i = 0; i< array.length; i++){
//            nr1 = array[i];
//            for (int y = 1; y< array.length; y++){
//                nr2 = array[y];
//                if (nr1==nr2){
//                    System.out.print("The duplicate number is: "+ nr1);
//                    System.out.println(" and the index of the duplicate number is: "+ i);
//                    System.out.print("The duplicate number is: "+ nr2);
//                    System.out.println(" and the index of the duplicate number is: "+ y);
//                }
//            }
//        }
//    }

            //Ex 5 Optional
//    public void duplicates (int[]array){
//        int[] arrayCopy = new int[array.length];
//        for (int a = 0; a < array.length; a++) {
//            arrayCopy[a] = array[a];
//
//        for (int i = 0; i<array.length; i++) {
//            for (int y = 1; y< arrayCopy.length;y++) {
//                if (array[i] == array[y]){
//                    System.out.print("The duplicate number is: "+ array[i]);
//                    System.out.println(" and the index of the duplicate number is: "+ i);
//                    y--;
//                }
//            }
//        }
//    }
}