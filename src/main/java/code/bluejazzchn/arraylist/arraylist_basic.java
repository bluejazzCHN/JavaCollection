/*
 * 名称：ArrayList基本使用演示
 * 作者：bluejazzchn
 *
 * */

package code.bluejazzchn.arraylist;

import java.util.ArrayList;
import java.util.*;

public class arraylist_basic {
    public static void main(String[] args) {

        //创建学生姓名 ArrayList
        ArrayList studentNameList = new ArrayList();
        studentNameList.add("小王");
        studentNameList.add("小张");
        studentNameList.add("小李");

        System.out.println("学生列表，共{" + studentNameList.size() + "人}:");
        //使用for循环遍历学生姓名
        System.out.println("-------------------------");
        for (Object s : studentNameList) {
            System.out.println(s);
        }
        //使用迭代器循环遍历学生姓名
        Iterator it = studentNameList.iterator();
        System.out.println("-------------------------");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}