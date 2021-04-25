package lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOP op = new LogicalOP();

        //Ex 1
//        List<Integer> list = op.setListToNumber(20);
//        op.printListEachLine(list);
        //SAU
//        List<Integer> list2 = op.setListToNumber(60, -20);
//        op.printListEachLine(list2);

        //Ex 2
//        List<Float> list = new ArrayList<>();
//        list.add(92.1f);
//        list.add(37.5f);
//        list.add(67f);
//        list.add(95f);
//        list.add(80.5f);
//        list.add(29.1f);
//        list.add(87f);
//        list.add(62f);
//        list.add(61.3f);
//        list.add(23.5f);
//
//        op.addToEnd(list, 22.2f);
//        System.out.println(list);

        //Ex 3
//        List<Integer> list = op.setListToNumber(50);
//        op.printListEachLine(list, 20);
        //SAU
//        List<Integer> list = new ArrayList<>();
//        list.add(37);
//        list.add(39);
//        list.add(42);
//        list.add(26);
//        list.add(14);
//        list.add(34);
//        list.add(17);
//        list.add(4);
//        list.add(33);
//        list.add(19);
//        op.printListEachLineFromNumber(list,26);

        //Ex 4
//        List<Integer> list = op.setListToNumber(50);
//        op.printListFromMaxToStart(list);

        //Ex 5
//        List<String> list = new ArrayList<>();
//        list.add("My");
//        list.add("Name");
//        list.add("Is");
//        list.add("Andreica");
//        list.add("Razvan");
//        list.add("Liviu");
//        list.add("And");
//        list.add("I like to");
//        list.add("PLay");
//        list.add("Games");
//
//        op.putInIndex(list,5, "I'M HERE");
//        System.out.println(list);

        //Ex 6
//        List<Integer> list = op.setListToNumber(10);
//        op.setFirst(list, 22);
//        System.out.println(list);

        //Ex 7
//        List<Integer> list = new ArrayList<>();
//        list.add(37);
//        list.add(39);
//        list.add(42);
//        list.add(26);
//        list.add(14);
//        list.add(34);
//        list.add(17);
//        list.add(4);
//        list.add(33);
//        list.add(19);
//
//        op.showDetails(list);

        //Ex 8
//        List<Integer> list = new ArrayList<>();
//        list.add(37);
//        list.add(39);
//        list.add(42);
//        list.add(26);
//        list.add(14);
//        list.add(34);
//        list.add(17);
//        list.add(4);
//        list.add(33);
//        list.add(19);
//
//        System.out.println(op.showBiggerNumber(list));

        //Ex 1 Optional
//        List<Integer> list = new ArrayList<>();
//        list.add(37);
//        list.add(39);
//        list.add(42);
//        list.add(26);
//        list.add(14);
//        list.add(34);
//        list.add(17);
//        list.add(4);
//        list.add(33);
//        list.add(19);
//
//        System.out.println(op.switchNumbers(list, 37, 4));

        //Ex 2 Optional
//        System.out.println(op.evenNumbers(op.setListToNumber(-20,20)));

        //Ex 3 Optional
        List<Integer> list = new ArrayList<>();
        list.add(37);
        list.add(39);
        list.add(42);
        list.add(26);
        list.add(14);
        list.add(34);
        list.add(17);
        list.add(4);
        list.add(33);
        list.add(19);
        System.out.println(op.order2(list));
    }
}
