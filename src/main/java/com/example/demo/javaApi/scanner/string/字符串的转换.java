package com.example.demo.javaApi.scanner.string;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 18:32
 * @Version 1.0
 */
public class 字符串的转换 {
    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        System.out.println(chars);
        System.out.println(chars.length);
        System.out.println("=======================");
        /*转换成字符串*/
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes);
        System.out.println("=======================");
        //字符串的替换
        String str1="how do you do now?";
        String str2=str1.replace("o","$");
        System.out.println(str2);
        String str3="会不会玩呀 你大爷的";
        String str4=str3.replace("大爷","**");
        System.out.println(str4);

    }
}
