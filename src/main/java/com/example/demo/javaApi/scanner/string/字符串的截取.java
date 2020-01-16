package com.example.demo.javaApi.scanner.string;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 18:23
 * @Version 1.0
 */
public class 字符串的截取 {
    public static void main(String[] args) {
        String str="bubsjdhabdua";
        String ss = str.substring(2, 4);//左闭右开 包含左不包含右
        System.out.println(ss);
    }
}
