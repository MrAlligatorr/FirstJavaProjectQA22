package remakeHomework.lab4Loops;

public class LogicalOPRemake {
    remakeHomework.lab3IfElse.LogicalOPRemake op = new remakeHomework.lab3IfElse.LogicalOPRemake();

    public void count(int nr) {
        for (int i = nr; i <= 100; i++) {
            System.out.println(i);
        }
        if (nr > 100) {
            System.out.println("Nuber is greater than 100");
        }
    }

    public void ex2(int nr) {
        if (nr < 100) {
            for (int i = nr; i >= -100; i--) {
                System.out.println(i);
            }
        } else System.out.println("Number is lower than -100");
    }

    public void ex3(int nr1, int nr2) {
        for (int i = nr1; i <= nr2; i++) {
            System.out.println(i);
        }
    }

    public void ex4(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        for (int i = smaller; i <= bigger; i++) {
            System.out.println(i);
        }
    }

    public void ex5(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        for (int i = smaller; i <= bigger; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void ex6(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        for (int i = smaller; i <= bigger; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int sum(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int sum = 0;
        for (int i = smaller; i <= bigger; i++) {
            sum += i;
        }
        return sum;
    }

    public float ex8(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int sum = 0;
        int count = 0;
        for (int i = smaller; i <= bigger; i++) {
            sum += i;
            count++;
        }
        return sum / (float) count;

    }

    public void stars(int nr1) {
        for (int i = 1; i <= nr1; i++) {
            for (int j = i; j <= nr1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //While
    public void ex1W(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        do {
            System.out.println(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex2W(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        do {
            System.out.println(bigger);
            bigger--;
        } while (bigger >= smaller);
    }

    public void ex3W(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        do {
            System.out.println(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex4W(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        do {
            System.out.println(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex5W(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        do {
            if (smaller % 2 == 0) {
                System.out.println(smaller);
            }
            smaller++;
        } while (smaller <= bigger);
    }

    public void ex6W(int nr1, int nr2) {
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
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
        int bigger = op.checkBiggerNumber(nr1, nr2);
        int smaller = op.checkSmallerNumber(nr1, nr2);
        int sum = 0;
        int count = 0;
        do {
            if (smaller % 7 == 0) {
                count++;
                sum += smaller;
            }
            smaller++;
        } while (smaller <= bigger);
        return (sum / (float) count);
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
        int i = 0;
        do {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else System.out.print(i+" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        } while (i < 110);
    }

    public void wozaCozaLoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}