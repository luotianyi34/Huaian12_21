package Demo01;

import Demo.Student;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>() ;
        ArrayList list2 = new ArrayList<>();
        list2.add(new Students(1));
        list2.add(new Students(1));
        System.out.println(list2);
        list.add(list2);
        list.add(list2);
//        System.out.println(list);
        System.out.println(list.get(0)==(list.get(1)));
//        list.add(new Students(1));
//        list.add(new Students(1));
    }
}
