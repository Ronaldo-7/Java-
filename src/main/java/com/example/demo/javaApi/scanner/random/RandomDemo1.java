package com.example.demo.javaApi.scanner.random;

import java.util.Random;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 15:42
 * @Version 1.0
 */
public class RandomDemo1 {
    public static void main(String[] args) {
        Random random=new Random();
        int i = random.nextInt();
        System.out.println("随机数字是："+i);
    }
}
