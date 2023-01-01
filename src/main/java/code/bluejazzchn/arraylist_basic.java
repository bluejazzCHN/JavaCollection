/*
 * 名称：ArrayList基本使用演示
 * 作者：bluejazzchn
 *
 * */

package code.bluejazzchn;

import java.util.ArrayList;

public class arraylist_basic {
    public static void main(String[] args) {
        ArrayList studentNameList = new ArrayList();
        studentNameList.add("小王");
        studentNameList.add("小张");
        studentNameList.add("小李");

        System.out.println("学生列表：");
        for (Object stuName : studentNameList){
            System.out.println(stuName);
        }
    }
}