package com.example.demo.javaApi.scanner.string;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 17:53
 * @Version 1.0
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] cha={'H','e','l','l','o'};
        String str3=new String(cha);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("Hello"));
        System.out.println(str1.equals("hello"));
        System.out.println(str1.equalsIgnoreCase("hello"));//忽略大小写
    }
}
