package com.example.demo.javaApi.scanner.random;

import java.util.Random;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/16 15:45
 * @Version 1.0
 */
public class RandomDemo2 {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10);
            System.out.println(i1+1);
        }
    }
}

