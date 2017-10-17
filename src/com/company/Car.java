package com.company;

public class Car {

    private String name;
    private String color;

    public Car() {
        System.out.println("A car has been created...");
    }

    public Car(String name) {
        name = "Corvette";
        System.out.println(name);
    }

    public String getName()

    {
        return name;
    }

    public String setName(String value)
    {
        return name = value;
    }
    public String getColor()
    {
        return this.color;
    }
    public String setColor(String value)
    {
        return color = value;
    }
    public String start(){
        return "The red Porsche is starting";

    }
    public String accelerate()
    {
        return "The red Porsche is accelerating";

    }
    public String mph()
    {
        return "The red Porsche is going 50 mph";
    }
    public String stop()
    {
        return "The red Porsche has stopped";
    }
    public String displayWhatAPorscheDoes()
    {
       String output;
       output = this.start() +" "+this.accelerate()+" "+this.mph()+" "+this.stop();
       return output;
    }
}