package com.example.demo.javaApi.scanner;

import java.util.Scanner;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 15:19
 * @Version 1.0
 */
public class ScannerMax {
    public static void main(String[] args) {
        int max=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数字");
        int i = scanner.nextInt();
        if(max<i){
            max=i;
        }
        System.out.println("请输入数字");
        int j = scanner.nextInt();
        if(max<j){
            max=j;
        }
        System.out.println("请输入数字");
        int k = scanner.nextInt();
        if(max<k){
            max=k;
        }
        System.out.println("最大值："+max);
    }
}
