package lab4;

public class LogicalOP {
    //ex 1 for
    public void countTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
        if (number > 100) {
            System.out.println("Number is greater than 100");
        }
    }

    //Ex 2 for
    public void countToMinus100(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
        if (number < -100) {
            System.out.println("Number is lower than -100");
        }
    }

    //Ex 3 for
    public void countBetweenInterval(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
        for (int i = number1; i >= number2; i--) {
            System.out.println(i);
        }
    }

    //Ex 4 for
    public void countBetweenIntervalSmallToBig(int number1, int number2) {
        lab3.LogicalOP op = new lab3.LogicalOP();
        int smaller = checkSmallerNumber(number1, number2);
        int bigger = op.checkBiggerNumber(number1, number2);
        for (int i = smaller; i <= bigger; i++) {
            System.out.println(i);
        }
    }

    public int checkSmallerNumber(int nr1, int nr2) {
        if (nr1 < nr2) {
            return nr1;
        }
        return nr2;
    }

    //Ex 5 for
    public void countEvenNumbers(int nr1, int nr2) {
        lab3.LogicalOP op = new lab3.LogicalOP();
        int smaller = checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        for (int i = smaller; i <= bigger; i++) {
            checkEvenNumber(i);
        }
    }

    public void checkEvenNumber(int number) {
        int modulo = number % 2;
        if (modulo == 0) {
            System.out.println(number);
        }
    }

    //Ex 6 for
    public void countOddNumbers(int nr1, int nr2) {
        lab3.LogicalOP op = new lab3.LogicalOP();
        int smaller = checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        for (int i = smaller; i <= bigger; i++) {
            checkOddNumbers(i);
        }
    }

    public void checkOddNumbers(int nr1) {
        if (nr1 % 2 != 0) {
            System.out.println(nr1);
        }
    }

    //Ex 7 for
    public int sumTo100(int nr1) {
        int sum = 0;
        for (int i = nr1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //Ex 8 for
    public float averageNumberTo100(int nr1) {
        int sum = 0;
        float count = 0;
        for (int i = nr1; i <= 100; i++) {
            sum += i;
            count++;
        }
        return sum / count;
    }

    //Ex 9 for
    public void stars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Ex 1 while
    public void countTo100While(int nr1) {
        do {
            if (nr1 > 100) {
                System.out.println("The number is over 100");
                break;
            }
            System.out.println(nr1);
            nr1++;
        } while (nr1 <= 100);
    }

    //Ex 2 while
    public void countToMinus100While(int nr1) {
        do {
            if (nr1 < -100) {
                System.out.println("The number is smaller than -100");
                break;
            }
            System.out.println(nr1);
            nr1--;
        } while (nr1 >= -100);
    }

    //Ex 3 while
    public void countBetweenIntervalWhile(int nr1, int nr2) {
        if (nr1 <= nr2) {
            do {
                System.out.println(nr1);
                nr1++;
            } while (nr1 <= nr2);
        } else
            do {
                System.out.println(nr1);
                nr1--;
            } while (nr1 >= nr2);
    }

    //Ex 4 while
    public void countBetweenIntervalSmallToBigWhile(int number1, int number2) {
        lab3.LogicalOP op = new lab3.LogicalOP();
        int smaller = checkSmallerNumber(number1, number2);
        int bigger = op.checkBiggerNumber(number1, number2);
        if (smaller <= bigger) {
            do {
                System.out.println(smaller);
                smaller++;
            } while (smaller <= bigger);
        } else
            do {
                System.out.println(smaller);
                smaller--;
            } while (smaller >= bigger);
    }

    //Ex 5 while
    public void countEvenNumbersWhile(int nr1, int nr2) {
        lab3.LogicalOP op = new lab3.LogicalOP();
        int smaller = checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        do {
            checkEvenNumber(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    //Ex 6 while
    public void countOddNumbersWhile(int nr1, int nr2) {
        lab3.LogicalOP op = new lab3.LogicalOP();
        int smaller = checkSmallerNumber(nr1, nr2);
        int bigger = op.checkBiggerNumber(nr1, nr2);
        do {
            checkOddNumbers(smaller);
            smaller++;
        } while (smaller <= bigger);
    }

    //Ex 7 while
    public void averageBetween111And8899() {
        int sum = 0;
        int nr1 = 111;
        int count = 0;
        do {
            sum = sum + nr1;
            count++;
            nr1++;
        } while (nr1 <= 8899);
        float average = sum / count;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }

    //Ex 8 while
    public float ex8(int nr1, int nr2) {
        int count = 0;
        float sum = 0;
        do {
            if (nr1 % 7 == 0) {
                sum = nr1 + sum;
                count++;
            }
            nr1++;
        } while (nr1 <= nr2);
        return sum / count;
    }

    // Ex 9 while
    public void fibonacci() {
        int nr1 = 0;
        int nr2 = 1;
        int nr3 = 1;
        int count = 1;
        System.out.println(nr1);
        do {
            System.out.println(nr3);
            nr3 = nr1 + nr2;
            nr1 = nr2;
            nr2 = nr3;
            count++;
        } while (count < 20);
    }

    //Ex 10 while
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



