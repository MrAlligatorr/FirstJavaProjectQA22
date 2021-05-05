package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    //Ex 1
    public int getInt() {
        boolean repeat;
        int number = 0;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner getNumber = new Scanner(System.in);
                number = getNumber.nextInt();
                repeat = false;
            } catch (InputMismatchException a) {
                repeat = true;
                System.out.println("Invalid value! Not a number!");
            }
        } while (repeat);
        return number;
    }

    //Ex 2
    public float getFloat() {
        boolean repeat;
        float number = 0;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner getNumber = new Scanner(System.in);
                number = getNumber.nextFloat();
                repeat = false;
            } catch (InputMismatchException a) {
                repeat = true;
                System.out.println("Invalid value! Not a number!");
            }
        } while (repeat);
        return number;
    }

    public double getDouble() {
        boolean repeat;
        double number = 0;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner getNumber = new Scanner(System.in);
                number = getNumber.nextDouble();
                repeat = false;
            } catch (InputMismatchException a) {
                repeat = true;
                System.out.println("Invalid value! Not a number!");
            }
        } while (repeat);
        return number;
    }

    public long getLong() {
        boolean repeat;
        long number = 0;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner getNumber = new Scanner(System.in);
                number = getNumber.nextLong();
                repeat = false;
            } catch (InputMismatchException a) {
                repeat = true;
                System.out.println("Invalid value! Not a number!");
            }
        } while (repeat);
        return number;
    }

    //Ex 3
    public int getValueFromIndex(int nr1) {
        boolean repeat;
        int number = 0;
        do {
            System.out.print("On the index " + nr1 + " add a number: ");
            try {
                Scanner getNumber = new Scanner(System.in);
                number = getNumber.nextInt();
                repeat = false;
            } catch (InputMismatchException a) {
                repeat = true;
                System.out.println("Invalid value! Not a number!");
            }
        } while (repeat);
        return number;
    }

    //Ex 5
    public int getIndex() {
        boolean repeat;
        int number = 0;
        do {
            System.out.print("Enter the index: ");
            try {
                Scanner getNumber = new Scanner(System.in);
                number = getNumber.nextInt();
                repeat = false;
            } catch (InputMismatchException a) {
                repeat = true;
                System.out.println("Invalid value! Not a number!");
            }
        } while (repeat);
        return number;
    }


}
