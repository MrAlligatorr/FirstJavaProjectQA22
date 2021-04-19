package remakeHomework.lab5Array;

public class LogicalOPRemake {

    public void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void setArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }


//    public void setArray(float[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//    }

    //Ex 2
    public void countFrom0(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + i);
        }
    }

    //Ex 3
//    public int[] evenArray(int[] array, int max) {
//        setArray(array) ;{
//            int count =0;
//            for (int i = 1; i < array.length; i++) {
//                if (i % 2 == 0) {
//                    array[count] = i;
//                    count++;
//                }
//            }
//            return array;
//        }
//    }

    //Ex 3.1
    public int[] even(int[] array) {
        for (int i = 0; i < 100; i++) {
            for (i = 1; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        return array;
    }
// Ex 4
//    public float average(float[] array) {
//        setArray(array);
//        float sum = 0;
//        int count= 0;
//        for (sum = 1; sum<= array.length; sum++) {
//            sum += array[count];
//            count++;
//        }
//        float average = (float)sum/ array.length;
//        return average;
//    }

    // Creati o metoda care sa primeasca un parametru de tip array de numere,
    // si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
//    public float average(float[] array) {
//        for (int x=int i = 0; i < array.length; i++) {
//            array[i] = i + 1;)
//        float sum = 0;
//        for (int i=0; i<array.length; i++){
//            sum=+array[i];
//        }
//        return (float) sum/array.length;
//    }

//    public float[] average(float[] array) {
//        for (int i = 0; i < 100; i++) {
//            float sum = 0;
//            for (i = 1; i < 100; i++) {
//                sum=+array[i];
//            }float avg = (float) sum/array.length;
//            return (float)avg;
//        }
//    }

//    5. Creati o metoda care sa primeasca un parametru de tip array
//    de string-uri, populat cu valori, si un parametru de tip String.
//    Metoda sa verifice daca valoarea string-ului primit se regaseste
//    in array-ul primit, iar daca da sa returneze true iar daca nu, sa
//    returneze false.  Apelati metoda in main() pentru a verifica daca
//    functioneaza.

//    public boolean[] array5(String[] array, String text) {
//        for (int i = 0; i<array.length; i++){
//            if (array[i]==text){
//                return true ;
//            }
//
//        }
//    }
}