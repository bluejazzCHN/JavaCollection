/*
 * 名称：HashMap基本使用演示
 * 作者：bluejazzchn
 *
 * */
package code.bluejazzchn.hashmap;

import java.util.HashMap;

public class hashmap_basic {
    public static void main(String[] args) {
        //声明保存Key：学生学号Integer和Value：姓名String的HashMap
        HashMap<Integer, String> studentHashMap = new HashMap<>();
        studentHashMap.put(102, "小王");
        studentHashMap.put(103, "小张");
        studentHashMap.put(104, "小李");

        //输出HashMap的结果 {102=小王, 103=小张, 104=小李}
        System.out.println("-------------------------");
        System.out.println(studentHashMap);

        //声明保存Key：姓名String和Value：学生学号Integer的HashMap
        HashMap<String, Integer> studentHashMap1 = new HashMap<>();
        studentHashMap1.put("小王", 102);
        studentHashMap1.put("小张", 103);
        studentHashMap1.put("小李", 104);

        //输出HashMap的结果 {小李=104, 小王=102, 小张=103}
        System.out.println("-------------------------");
        System.out.println(studentHashMap1);

        //如何通过Key获得Value
        System.out.println(studentHashMap.get(102));
        System.out.println(studentHashMap1.get("小王"));
        //如果Key不存在，则返回null
        System.out.println(studentHashMap.get(110));
    }
}
