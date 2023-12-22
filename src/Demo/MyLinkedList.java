package Demo;

import java.util.LinkedList;

public class MyLinkedList {
    /*LinkedList 双向循环链表
    每个元素彼此相连 插入和删除元素时 只需要修改元素之间的应用关系就行
    特点:1.增加 删除效率高
        2.查询慢
    方法:
        1.addFirst() 将指定元素插入表头
        2.addLast() 插入在结尾
        3.getFirst() 获取第一个元素
        4.getLast() 获取最后一个元素
        5.lastIndexOf(obj) 查询指定元素的索引位置（如果不存在则返回-1）
        6.ListIterator 迭代器
        7.removeFirst()
        8.removeLast()
    * *//*
    LinkedList 操作元素时候使用 新增 修改 删除 4000+
    ArrayList 查询的时候用
    */
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        //普通的链表
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");

        //压栈添加
        list.addFirst("aaa");
        list.addFirst("bbb");
        list.addFirst("ccc");
        list.addFirst("ddd");
        System.out.println(list.getFirst());
        System.out.println(""+(list.lastIndexOf("ccc")+1));
        System.out.println(""+list.removeFirst());

    }
}
