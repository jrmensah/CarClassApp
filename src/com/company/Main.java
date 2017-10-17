package com.company;

public class Main {

    public static void main(String[] args) {

        Car a = new Car();
        a.setName("Porsche");
        a.setColor("Red");
        System.out.println("This is a" + " " +a.getName());
        System.out.println(a.start());
        System.out.println(a.accelerate());
        System.out.println(a.mph());
        System.out.println(a.stop());
        System.out.println();
    }
}
