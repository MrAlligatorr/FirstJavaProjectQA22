package remakeHomework.lab3IfElse;

public class LogicalOPRemake {
    public int checkBiggerNumber(int nr1, int nr2) {
        if (nr1 < nr2) {
            return nr2;
        }
        return nr1;
    }

    public String verify(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }

    public String verify(String text, int nr1) {
        if (text.equals(" FastTrackIT ") && nr1 <= 3) {
            return text + nr1;
        }
        return nr1 + text;
    }

    public String snow(int nr1) {
        if (nr1 > 8 || nr1 == 6) {
            return "The amount of snow this winter was(cm): " + nr1;
        }
        return "The forecast snow is(cm): " + nr1;
    }

    public String ex7(int nr1) {
        if (nr1 > 3 && nr1 != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (nr1 == 4) {
            return "The number is equal to 4";
        } else if (nr1 < 3) {
            return "The number is lower than 3";
        }
        return "The number is equal to 3";
    }

    public void ex8(int nr) {
        switch (nr) {
            case 0:
                System.out.println("The number is 0");
                break;
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            case 7:
                System.out.println("The number is 7");
                break;
            case 8:
                System.out.println("The number is 8");
                break;
            case 9:
                System.out.println("The number is 9");
                break;
            case 10:
                System.out.println("The number is 10");
                break;
            default:
                System.out.println("The number is: "+nr);
        }
    }

    public boolean isNumberEven (int nr){
        if (nr%2==0){
            return true;
        }return false;
    }

    public boolean isEligibleToVote (int nr){
        if (nr>=18){
            return true;
        }return false;
    }

    public int checkBiggerNumber (int nr1, int nr2, int nr3){
        if (nr1>nr2 && nr1>nr3){
            return nr1;
        }else if (nr2>nr1 && nr2>nr3){
            return nr2;
        }return nr3;
    }

    public int checkSmallerNumber (int nr1, int nr2){
        if (nr1 > nr2) {
            return nr2;
        }
        return nr1;
    }
}
