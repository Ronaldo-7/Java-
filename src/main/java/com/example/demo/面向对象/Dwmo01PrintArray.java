package com.example.demo.面向对象;
import java.util.Arrays;
/**
 * @Author WenXiao Meng
 * @Date 2020/1/14 13:48
 * @Version 1.0
 */
public class Dwmo01PrintArray {
    public static void main(String[] args){
        int[] array={10,20,30,40,50,60};
        //要求打印[10,20,30,40,50,60]
        //1 面向过程
        System.out.print("[");
        for(int i=0;i<=array.length-1;i++){
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }else {
                System.out.print(array[i]+",");
            }
        }
        System.out.println("-------------------------------");
        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
