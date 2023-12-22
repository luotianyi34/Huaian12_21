package HomeWork;

import com.sun.deploy.util.Waiter;

import java.util.*;

public class HomeWork {
    //ArrayList的嵌套  二维数组利用ArrayList的嵌套 双色球系统
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> BigArray = new ArrayList<>();
        ArrayList<ArrayList<Integer>> Select_BigArray = new ArrayList<>();
        ArrayList<Integer> RedArray = new ArrayList<>();
        ArrayList<Integer> Select_RedArray = new ArrayList<>();
        ArrayList<Integer> BlueArray = new ArrayList<>();
        ArrayList<Integer> Select_BlueArray = new ArrayList<>();
        System.out.println("请输入所选的红色球:");
        RedSelect(Select_RedArray);
        System.out.println("请输入所选的蓝色球:");
        BlueSelect(Select_BlueArray);
        RedRandom(RedArray);//生成红色球
        BlueRandom(BlueArray);//生成蓝色球
        BigArray.add(RedArray);//嵌套数组为大数组
        BigArray.add(BlueArray);
        Select_BigArray.add(Select_RedArray);//嵌套数组为大数组
        Select_BigArray.add(Select_BlueArray);
        System.out.println("您所选的红色球为:"+Select_BigArray.get(0)+"\n所选的蓝色球为:"+Select_BigArray.get(1));
        System.out.println("生成红色球和蓝色球中......请稍后......");
        System.out.println("中奖红色球为:"+BigArray.get(0)+"\n中奖蓝色球为:"+BigArray.get(1));
        System.out.println("正在兑奖中......请稍后......");
        IfWin(BigArray,Select_BigArray);
    }
    public static void RedRandom(List list){
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33)+1;
            if (!list.contains(num)) {
                list.add(num);
            }else {
                i--;
            }
        }
        Collections.sort(list);
    }
    public static void BlueRandom(ArrayList list){
        Random random = new Random();
        list.add(random.nextInt(16)+1);
    }
    public static void RedSelect(ArrayList list){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int loop= 0;
        do{
            loop=0;
            for (int i = 0; i < 6; i++) {
                num = scanner.nextInt();
                if (num<=0||num>33){
                    loop=-1;
                    System.out.println("输入错误，请重新输入！");
                    list.clear();
                    break;
                }
                for (int j = 0; j < 6; j++) {
                    if (list.contains(num)){
                        loop=-1;
                        System.out.println("输入的红球有重复，请重新输入！");
                        list.clear();
                        break;
                    }
                }
                if (loop==0){
                    list.add(num);
                }
            }
        }while (loop!=0);
        Collections.sort(list);
    }
    public static void BlueSelect(ArrayList list){
        Scanner scanner = new Scanner(System.in);
        int loop;
        do {
            loop=0;
            for (int i = 0; i < 1; i++) {
                int num = scanner.nextInt();;
                if (num<=0||num>17){
                    System.out.println("输入错误,请重新输入");
                    loop=1;
                    break;
                }else {
                    list.add(num);
                }
            }
        }while (loop!=0);
    }
    public static void IfWin(ArrayList<ArrayList<Integer>> list1,ArrayList<ArrayList<Integer>> list2){
        int WinRNumber=0,WinBNumber = 0 ;
        if(list1.get(1).get(0)==list2.get(1).get(0)){
            WinBNumber++;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (list2.get(0).get(i)==list1.get(0).get(j)){
                    WinRNumber++;
                }
            }
        }
        //判断中奖条件
        if (WinRNumber==6&&WinBNumber==1){
            System.out.println("恭喜您中一等奖！");
        } else if (WinRNumber==6) {
            System.out.println("恭喜您中二等奖！");
        } else if (WinRNumber==5&WinBNumber==1){
            System.out.println("恭喜您中三等奖！");
        } else if ((WinRNumber==5)||(WinRNumber==4&&WinBNumber==1)) {
            System.out.println("恭喜您中四等奖！");
        } else if ((WinRNumber==4)||(WinRNumber==3&&WinBNumber==1)) {
            System.out.println("恭喜您中五等奖！");
        } else if (/*(WinRNumber==1&&WinBNumber==1)||(WinRNumber==2&&WinBNumber==1)||*/(WinBNumber==1)) {
            System.out.println("恭喜您中六等奖！");
        } else {
            System.out.println("没有中奖，下次再来吧！");
        }
    }
}
