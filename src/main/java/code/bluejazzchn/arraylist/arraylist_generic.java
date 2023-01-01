/*
 * 名称：ArrayList泛型使用演示
 * 作者：bluejazzchn
 *
 * */
package code.bluejazzchn.arraylist;

import java.util.ArrayList;

class Student {
    public String name;
    public float grd;

    Student(String n, float g) {
        this.name = n;
        this.grd = g;
    }
}

public class arraylist_generic {
    public static void main(String[] args) {
        //创建3个学生的数据结构
        Student wang = new Student("小王", 2.5f);
        Student zhang = new Student("小张", 3.5f);
        Student li = new Student("小李", 4.5f);

        //创建泛型的Arraylist，并添加上面创建的三个学生信息
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(wang);
        studentList.add(zhang);
        studentList.add(li);

        //便利学生信息
        System.out.println("学生列表，共{" + studentList.size() + "人}:");
        for (Student s : studentList) {
            System.out.println("-------------------------");
            System.out.print("学生姓名：" + s.name);
            System.out.println("  等级分：" + s.grd);
        }
    }
}
