package com.example.demo.javaApi.scanner;

import java.util.Scanner;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 14:46
 * @Version 1.0
 */
public class ScannerText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.println("请输入");
        int next = scanner.nextInt();
        System.out.println(next);
        System.out.println(i+"+"+next+"="+(i+next));

    }
}
