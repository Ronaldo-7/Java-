package com.example.demo.javaApi.scanner;

import java.util.Scanner;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 15:05
 * @Version 1.0
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字相加");
        int i = scanner.nextInt();
        System.out.println(i);
        int j = scanner.nextInt();
        System.out.println(j);
        System.out.println(i+"+"+j+"="+(i+j));
    }
}
