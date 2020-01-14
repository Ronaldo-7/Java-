package com.example.demo.面向对象;

/**
 * @Author WenXiao Meng
 * @Date 2020/1/14 20:11
 * @Version 1.0
 */
public class Phone {
    private String brand;//品牌
    private double  price;
    private String color;

    public void call(String  who){
        System.out.println("给"+who +"打电话");
    }
    public void  sendMessage(){
        System.out.println("群发短信");
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
