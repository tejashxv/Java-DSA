package Arrays;

import java.util.ArrayList;

public class ArraysListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(434);
        list.add(434);
        list.add(434);
        list.add(434);
        list.add(434);
        list.add(434);
        list.add(434);
        list.add(434);
        list.add(434);


        System.out.println(list);
        list.set(0,2);

        System.out.println(list);
    }
}
