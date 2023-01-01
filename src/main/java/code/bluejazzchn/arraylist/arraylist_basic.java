/*
 * 名称：ArrayList基本使用演示
 * 作者：bluejazzchn
 *
 * */

package code.bluejazzchn.arraylist;

import java.util.ArrayList;

public class arraylist_basic {
    public static void main(String[] args) {

        //创建学生姓名 ArrayList
        ArrayList studentNameList = new ArrayList();
        studentNameList.add("小王");
        studentNameList.add("小张");
        studentNameList.add("小李");

        System.out.println("学生列表，共{" + studentNameList.size() + "人}:");
        //遍历学生姓名
        for (Object s : studentNameList) {
            System.out.println(s);
        }
    }
}