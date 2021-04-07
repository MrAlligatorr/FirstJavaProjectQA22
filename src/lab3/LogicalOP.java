package lab3;

public class LogicalOP {

    //Ex 3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //Ex 4
    public String learnTextComparison(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    //Ex 5
    public String ex5(String text, int nr) {
        if (text.equals("FastTrackIT ") && nr <= 3) {
            return text + nr;
        } else if (nr >= 4 && !text.equals("FastTrackIT ")) {
            return text + nr;
        }
        return "";
    }

    //Ex 6
    public String snow(int cmOfSnow) {
        if (cmOfSnow > 8 || cmOfSnow == 6) {
            return "The amount of snow this winter was(cm): " + cmOfSnow;
        }
        return "The forecast snow is(cm):" + cmOfSnow;
    }

    //Ex 7
    public String ex7(float nr1) {
        if (nr1 > 3 && nr1 != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (nr1 == 4) {
            return "The number is equal to 4";
        } else if (nr1 < 3) {
            return "The number is lower than 3";
        }
        return "The number can't be equal to 3";
    }

    //Ex 8
    public String ex8(int nr) {
        switch (nr) {
            case 1:
                System.out.println("The number is: " + nr + " !");
                break;
            default:
                System.out.println("The number is: " + nr + " !");
                break;
        }
        return "The number is: " + nr + " !";
    }

    //Ex 9
    public String isNumberEven(int nr1) {
        if (nr1 % 2 == 0) {
            return "True";
        }
        return "False";
    }

    //Ex 10
    public String isEligibleToVote(int age) {
        if (age > 18) {
            return "True";
        }
        return "False";
    }

    //Ex 11
    public int ex11(int nr1, int nr2, int nr3) {
        if (nr1 > nr2 && nr1 > nr3) {
            return nr1;
        } else if (nr2 > nr1 && nr2 > nr3) {
            return nr2;
        } else if (nr3 > nr1 && nr3 > nr2) {
            return nr3;
        }
        return nr1;
    }
}
