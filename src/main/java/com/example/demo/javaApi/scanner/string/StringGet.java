package com.example.demo.javaApi.scanner.string;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 18:12
 * @Version 1.0
 */
public class StringGet {
    public static void main(String[] args) {
        int length="kskkkkkkkkk".length();
        System.out.println("字符串的长度："+length);
        //拼接字符串
        String str1="Hello";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //获取指定索引的位置
        char ch="Hello".charAt(0);
        System.out.println("获取的字符串"+ch);
        //查找参数字符串在本来字符串出现的第一次索引位置
        //如果有返回-1
        String or="hello";
        int index=or.indexOf("llo");
        System.out.println(index);
        System.out.println("ssss".indexOf("a"));
    }
}
