package ClassTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClassTest {
//定义一个ArrayList集合A，添加不少于8组数据，要求，必须有重复的数据
//1.删除重复的数据元素(前提)
//2.创建B集合   B集合中的数据结构与A集合的数据结构致
//3.分别获取A集合和B集合的交集和并集
//4.将获取到的交集后，B集合中剩余的元素放入A集合中
//获取到的交集，从B集合中删除

    public static void main(String[] args) {
        List A = new ArrayList<>();
        List B = new ArrayList<>();
        A.addAll(addA());
        B.addAll(addA());
        quchong(A);
        System.out.println(A);
    }
    public static List addA(){
        List Newlist = new ArrayList<>();
        Newlist.add("aaa");
        Newlist.add("bbb");
        Newlist.add("ccc");
        Newlist.add("ddd");
        Newlist.add("eee");
        Newlist.add("aaa");
        Newlist.add("ccc");
        return Newlist;
    }
    public static List addB(){
        List Newlist = new ArrayList<>();
        Newlist.add("aaa");
        Newlist.add("bbb");
        Newlist.add("fff");
        Newlist.add("ddd");
        Newlist.add("eee");
        Newlist.add("aaa");
        Newlist.add("eee");
        return Newlist;
    }
    public static void quchong(List list){
//        List NewList = new ArrayList<>();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = (String) listIterator.next();
            if (list.indexOf(str) != list.lastIndexOf(str)){
                listIterator.remove();
            }
        }
    }
}

