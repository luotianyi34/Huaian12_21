package Demo;

import java.util.ArrayList;

public class demo03 {
    /*ArrayList 实现了List接口的可扩容数组（动态数组）
    他的内部是基于数组实现的 可以理解为多个数组整合放在一起，就成为了ArrayList
    可以实现所有可选择的列表操作，允许所有的元素，包括空值 能够自动动态的扩容
    Vector与ArrayList几乎一样
    唯一的区别：Vector会给每个元素上锁(Collections.synchronizedList)
              自动扩容比array list 多50%
    防止多线程访问元素时发生数据不同步的情况
    ArrayList特点:数组结构 访问速度快 插入和删除慢一点
    数据有序 根据下标来确定位置 里面的元素可以重复
    线程不安全 效率高
    * */
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        //ArrayList嵌套 二维数组 利用ArrayList的嵌套 双色球系统
    }
}
