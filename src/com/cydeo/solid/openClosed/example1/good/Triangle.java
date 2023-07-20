package com.cydeo.solid.openClosed.example1.good;

public class Triangle implements Shape{

    private double side;
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
