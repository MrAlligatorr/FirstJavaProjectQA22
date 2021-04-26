package lab6;

import java.util.ArrayList;
import java.util.List;

public class LogicalOP {
    lab4.LogicalOP op = new lab4.LogicalOP();
    lab3.LogicalOP op1 = new lab3.LogicalOP();

    public List<Integer> setListToNumber(int nr1) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= nr1; i++) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> setListToNumber(int minValue, int maxValue) {
        List<Integer> list = new ArrayList<>();
        int smaller = op.checkSmallerNumber(minValue, maxValue);
        int bigger = op1.checkBiggerNumber(minValue, maxValue);
        for (int i = smaller; i <= bigger; i++) {
            list.add(i);
        }
        return list;
    }

    //Ex 1
    public void printListEachLine(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //Ex 2
    public List<Float> addToEnd(List<Float> list, float nr1) {
        list.add(nr1);
        return list;
    }

    //Ex 3
    public void printListEachLine(List<Integer> list, int nr1) {
        for (int i = nr1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        if (nr1 > list.size()) {
            System.out.println("Number is greater than the list size!");
        }
    }

    public void printListEachLineFromNumber(List<Integer> list, int nr1) {
        for (int i = 0; i < list.size(); i++) {
            if (nr1 == list.get(i)) {
                for (int y = i; y < list.size(); y++) {
                    System.out.println(list.get(y));
                }
            }
        }
    }

    //Ex 4
    public void printListFromMaxToStart(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    //Ex 5
    public List<String> putInIndex(List<String> list, int nr1, String text) {
        list.add(nr1, text);
        return list;
    }

    //Ex 6
    public List<Integer> setFirst(List<Integer> list, int nr1) {
        list.set(0, nr1);
        return list;
    }

    //Ex 7
    public void showDetails(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index is " + i + " and the number is " + list.get(i));
        }
    }

    //Ex 8
    public int showBiggerNumber(List<Integer> list) {
        int big = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (big < list.get(i)) {
                big = list.get(i);
            }
        }
        return big;
    }

    //Ex 1 Optional
    public List<Integer> switchNumbers(List<Integer> list, int nr1, int nr2) {
        for (int i = 0; i < list.size(); i++) {
            if (nr1 == list.get(i)) {
                list.set(i, nr2);
                continue;
            }
            if (nr2 == list.get(i)) {
                list.set(i, nr1);
            }
        }
        return list;
    }

    //Ex 2 Optional
    public List<Integer> evenNumbers(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                continue;
            }
            if (list.get(i) % 2 == 0) {
                evenList.add(list.get(i));
            }
        }
        return evenList;
    }


    //Ex 3 Optional
    public List<Integer> order(List<Integer> list) {
        for (int i = 0; i< list.size(); i++){
            for (int y =i+ 1; y<list.size(); y++){
                if (list.get(i)>list.get(y)){
                    int memo = list.get(i);
                    list.set(i, list.get(y));
                    list.set(y, memo);
                }
            }
        }
        return list;
    }

    //Ex 3 Optional (Wrong ones)
//    public List<Integer> order(List<Integer> list) {
//        List<Integer> orderList = new ArrayList<>();
//        int size = list.size();
//            int smaller=list.get(0);
//            for (int i = list.size(); i <=0 ; i--) {
//                if (list.get(0) > list.get(i)) {
//                    smaller = list.get(i);
//                }
//                orderList.add(smaller);
//                list.remove(smaller);
//            }
//        return orderList;
//    }

//    public List<Integer> order1(List<Integer> list) {
//        List<Integer> orderedList = list;
//        int small= list.get(0);
//            for (int i = list.size() - 1; i >= 0; i--) {
//                if (small > list.get(i)) {
//                    small = list.get(i);
//                }
//                orderedList.add(small);
//                list.remove(small);
//            }
//        return orderedList;
//    }

//    public List<Integer> order1(List<Integer> list) {
//        List<Integer> orderedList = list;
//        int small = list.get(0);
//        int index=0;
//        int i = list.size();
//        do {
//           do {
//               if (small > list.get(i)) {
//                   small = list.get(i);
//                   index=i;
//               }
//               i--;
//           }while (i>=0);
//            orderedList.add(small);
//            list.remove(index);
//            i=list.size();
//        }while (i==0);
//        return orderedList;
//    }

//    public int showBiggerNumber(List<Integer> list) {
//        int big = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (big < list.get(i)) {
//                big = list.get(i);
//            }
//        }
//        return big;
//    }

//    public List<Integer> order2(List<Integer> list) {
//        List<Integer> orderedList = new ArrayList<>();
//        int smallStart = list.get(0);
//        int small = smallStart;
//        for (int i = 0; i < list.size(); i++) {
//            int countStart = 0;
//            int count = countStart;
//            for (int y = 1; y < list.size(); y++) {
//                if (small > list.get(y)) {
//                    small = list.get(y);
//                    count = i;
//                }
//                count++;
//            }
//            list.remove(count);
//            orderedList.add(small);
//        }
//        return orderedList;
//    }

//    public List<Integer> order2(List<Integer> list) {
//        List<Integer> orderedList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            int small = list.get(0);
//            int count = 0;
//            for (int y = 0; y < list.size(); y++) {
//                if (small > list.get(y)) {
//                    small = list.get(y);
//                    count = i;
//                }
//            }
//            list.remove(count);
//            orderedList.add(small);
//        }
//        return orderedList;
//    }

}
