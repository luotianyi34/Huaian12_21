package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class demo02 {
    /*List 接口是Collection的子接口
    是有序的集合，它是用某种特定的插入顺序来”维护元素顺序“
    可以对该集合中元素的位置进行精确的控制
    访问集合中的元素是根据下标来访问的，get(index)来获取元素
    实现List接口的集合类有：ArrayList LinkedList Vector Stack 堆栈继承自Vector push pop操作元素
    List特有的功能:
    1.add(index,element) 在集合中的指定位置插入一个元素element
    2.get(index) 根据下标访问指定位置的元素
    3.remove(index) 根据下标删除指定元素
    4.set(index,element) 根据下标设置元素的值
    List 有一个自己的迭代器 ListIterator 只能用于List
        1.previous();返回上一个元素
        2.hasPrevious():判断是否有上一个元素
        3.ListIterator():双向遍历

    * */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("赵六");
        System.out.println("最初的:"+list);
        //迭代器
        ListIterator listIterator = list.listIterator();
        //向下遍历
        System.out.println("向下遍历：");
        while (listIterator.hasNext()){
            String str = (String) listIterator.next();
            if(str.equals("张三")){
               // list.add("张三的老婆");//这里直接修改会报ConcurrentModificationException（并发修改异常）
                listIterator.add("张三的老婆");
            }
        }
        System.out.println(list);
        System.out.println("\n向上遍历：");

        //向上遍历
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+"  ");
        }

    }
}
