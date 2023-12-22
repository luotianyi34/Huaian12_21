package Demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo01 {
    /*集合类 容器 将具有相同特征的对象放在一个容器中
    面向对象 方便操作多个对象
    数组 可以放对象但是数组的长度是固定的 是集合的一种但不属于集合类
    集合 只能存放对象 长度是可扩展的 集合可以存放不同类型的对象

    Collection 接口： 是最基本的集合接口 它定义了一组允许同步的对象，
            Set 子接口  hashset treeset LinkedHashSet.....
            List 子接口 ArrayList LinkedList
            Queue 队列子接口  额外的插入，读取，对比查询
            Map 子接口 k-v形式的存储对象 不能包含重复的Key
    通用方法:
    add(E e)方法 添加元素
    clear()方法 移除集合中的所有元素 清空
    remove(Object e)方法 从集合中删除指定的元素
    contains(Object e)方法 查看集合中是否包含指定的元素
    isEmpty()方法 集合中是否包含元素
    size()方法 集合的元素个数

    批量(多个集合)操作:
    addAll() 将指定的所有元素都添加到集合中
    containAll() 如果A集合中完全包含B集合中的元素就返回true
    removeAll(Collection c) 在A集合中移除指定的子集合 移除A与B集合的交集
    retainAll() 取两个集合的交集

    ArrayList():1.有序的 2.重复元素

    遍历集合:
    toArray(T[] a) 将集合转化成一个数组
    for循环
    增强for循环 for(元素的类型 变量名称:遍历的集合对象){//具体操作}
    iterator 迭代器 遍历集合
        hasNext() 判断是否还有元素
        next()    下一个元素
        remove()  从迭代器中移除一个指定的元素
    * */
    public static void main(String[] args) {

        //通过接口new一个子类实例  实例化一个集合
        Collection list1 = new ArrayList();

        list1.add("周杰伦");
        list1.add("刘德华");
        list1.add("薛之谦");
        list1.add("王力宏");

        Collection list2 = new ArrayList();

        list2.add("赵丽颖");
        list2.add("杨幂");
        list2.add("迪丽热巴");
        list2.add("高圆圆");
        list2.add("刘德华");

        Collection list3 = new ArrayList();

        list3.add("刘德华");

        list1.retainAll(list2);
//        System.out.println(list1.containsAll(list3));
//        list1.removeAll(list2);//移除交集
        System.out.println(list1);






//        System.out.println(list);
//        System.out.println("移除李四 "+list.remove("李四"));
//        System.out.println(list);
//        System.out.println(list.contains("李四"));
//        list.clear();
//        System.out.println(list.isEmpty());
//        System.out.println(list);



    }
    @Test
    public void getStudentList(){
        Collection list = new ArrayList();
        list.add(new Student(001,"周杰伦"));
        list.add(new Student(002,"周杰伦"));
        list.add(new Student(003,"周杰伦"));
        list.add(new Student(004,"陈奕迅"));
        list.add(new Student(005,"尼古拉斯赵四"));
        list.add(new Student(005,"周杰伦"));
        list.add(new Student(005,"周杰伦"));

////        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(((ArrayList)list).get(i));
//        }
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){//如果有下一个元素，那么就读取值
//            System.out.println(iterator.next());
//        }

        //增强for循环 for(元素的类型 变量名称:遍历的集合对象){//具体操作}
        for(Object student:list){
            System.out.println(student);
        }
        //jdl1.8新特性 Stream流 lambda 日期流 function函数

    }
}
