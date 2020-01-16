package com.example.demo.javaApi.scanner.list;

import com.example.demo.pojo.Student;

import java.util.ArrayList;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 16:35
 * @Version 1.0
 */
public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<>();
        Student student=new Student("iso",18);
        Student student2=new Student("ronaldo",18);
        Student student3=new Student("messi",18);
        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println("长度："+arrayList.size());
        System.out.println("名字："+arrayList.get(0).getName());
        System.out.println(arrayList.toString());
        System.out.println("----------------------------------------");
        Object o = array1(arrayList);
        System.out.println(o);

    }
    public static Object  array1(ArrayList arrayList){

        return arrayList.toString();
    }
}
