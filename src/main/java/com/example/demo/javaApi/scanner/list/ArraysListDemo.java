package com.example.demo.javaApi.scanner.list;

import java.util.ArrayList;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 16:09
 * @Version 1.0
 */
public class ArraysListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("张靓颖1");
        list.add("张靓颖2");
        list.add("张靓颖3");
        list.add("张靓颖4");
        list.add("张靓颖5");
        System.out.println(list);
        System.out.println("listd额长度"+list.size());
        String remove = list.remove(0);
        System.out.println("被删掉的是："+remove);
        System.out.println(list);
        System.out.println("listd额长度"+list.size());
        System.out.println(list.get(3));
    }
}
