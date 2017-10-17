package com.company;

public class Main {

    public static void main(String[] args) {

        Porsche p = new Porsche();
        p.setName("Porsche");
        p.setColor("Red");
        System.out.println("This is a" + " " +p.getName());
        System.out.println(p.start());
        System.out.println(p.accelerate());
        System.out.println(p.mph());
        System.out.println(p.stop());
        System.out.println();

        System.out.println("----------------------------------------");

        Jetta j = new Jetta();
        j.setName("Jetta");
        j.setColor("Blue");
        System.out.println("This is a" + " " +j.getName());
        System.out.println(j.start());
        System.out.println(j.accelerate());
        System.out.println(j.emission());
        System.out.println(j.emissionpass());
        System.out.println(j.pass());
        System.out.println();

        System.out.println("----------------------------------------");

        System.out.println(p.start());
        System.out.println(j.start());
        System.out.println(p.accelerate());
        System.out.println(j.accelerate());
        System.out.println(j.emission());
        System.out.println(j.emissionpass());
        System.out.println(p.mph());
        System.out.println(p.stop());
        System.out.println(j.pass());
    }
}
