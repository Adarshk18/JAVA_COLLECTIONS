package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListexample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //to iterate in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is: " + list.get(i));
        }

        for (int element: list){
            System.out.println("the element is: " + element);
        }

        //Iterator

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("iterator " + it.next());
        }

//        list.add(4);
//        System.out.println(list);

        //to add at a particular index
//        list.add(3,21);
//        System.out.println(list);

//        to add new list in the current list
//        List<Integer> newList = new ArrayList<>();
//        newList.add(23);
//        newList.add(22);
//
//        list.addAll(newList);
//        System.out.println(list);

        //to get elements from a particular index
//        System.out.println(list.get(5));

//        list.remove(1);
//        System.out.println(list);

        //to remove elements
//        System.out.println(list.remove(Integer.valueOf(3)));
//        System.out.println(list);

        //to update value of element at particular index
//        list.set(2,34);
//        System.out.println(list);

        //to check particular element is present in the list or not
//        System.out.println(list.contains(34));


        //to remove whole list
//        list.clear();
//        System.out.println(list);
    }
}
