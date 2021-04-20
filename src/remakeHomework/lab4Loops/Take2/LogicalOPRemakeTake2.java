package remakeHomework.lab4Loops.Take2;

import remakeHomework.lab3IfElse.CalculatorRemake;
import remakeHomework.lab3IfElse.LogicalOPRemake;

public class LogicalOPRemakeTake2 {
    LogicalOPRemake op = new LogicalOPRemake();

    public void ex1W(int x, int y) {
        int smaller = op.checkSmallerNumber(x, y);
        int bigger = op.checkBiggerNumber(x, y);
        do {
            System.out.println(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex2W(int x, int y) {
        int smaller = op.checkSmallerNumber(x, y);
        int bigger = op.checkBiggerNumber(x, y);
        do {
            System.out.println(bigger);
            bigger--;
        } while (smaller <= bigger);
    }

    public void ex3W(int nr1, int nr2) {
        do {
            System.out.println(nr1);
            nr1++;
        } while (nr1 <= nr2);
    }

    public void ex4W(int nr1, int nr2) {
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        do {
            System.out.println(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex5W(int nr1, int nr2) {
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        do {
            if (smaller % 2 == 0) {
                System.out.println(smaller);
            }
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex6W(int nr1, int nr2) {
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        do {
            if (smaller % 2 != 0) {
                System.out.println(smaller);
            }
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex7W() {
        int nr1 = 111;
        int nr2 = 8899;
        double sum = 0;
        int count = 0;
        do {
            sum += nr1;
            nr1++;
            count++;
        } while (nr1 <= nr2);
        System.out.println(sum);
        System.out.println(sum / (float) count);
    }

    public float ex8W(int nr1, int nr2) {
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int sum = 0;
        int count = 0;
        do {
            if (smaller == 0) {
                smaller++;
            }
            if (smaller % 7 == 0) {
                sum += smaller;
                smaller++;
                count++;
            }
            smaller++;
        } while (smaller <= bigger);

        return sum / (float) count;
    }

    public void ex9W() {
        int nr0 = 0;
        int nr1 = 1;
        int count = 1;
        do {
            System.out.println(nr0);
            int nr2 = nr0 + nr1;
            nr0 = nr1;
            nr1 = nr2;
            count++;
        } while (count <= 20);
    }

    public void ex10W() {
        int nr1 = 1;
        do {
            if (nr1 % 3 == 0 && nr1 % 5 == 0 && nr1 % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (nr1 % 5 == 0 && nr1 % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (nr1 % 3 == 0 && nr1 % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (nr1 % 3 == 0 && nr1 % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (nr1 % 7 == 0) {
                System.out.print("Woza ");
            } else if (nr1 % 5 == 0) {
                System.out.print("Loza ");
            } else if (nr1 % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(nr1 + " ");
            }
            if (nr1 % 11 == 0) {
                System.out.println();
            }
            nr1++;
        } while (nr1 <= 110);
    }

    public void star(int nr1){
        for (int i=1; i<=nr1; i++){
            for (int j=nr1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
