package com.example.demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author WenXiao Meng
 * @Date 2019/12/16 17:17
 * @Version 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet();
        set.add("adc");
        set.add("adc2");
        set.add("adc3");
        set.add("adc4");
        set.add("adc5");
        System.out.println("哈希值："+set.hashCode());
        Iterator it = set.iterator();
        while(it.hasNext()){
            Object n = it.next();
            System.out.println("HashSet:"+n);
        }

    }
}
