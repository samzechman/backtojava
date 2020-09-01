package com.company;

public class Circle {
    private double radius;
    private double[] centerPoint = new double[2];

    public void setRadius (double input) {
        radius = input;
    }
    public void setCenterPoint (double x, double y){
        centerPoint[0] = x;
        centerPoint[1] = y;
    }

    public double getRadius(){
        return radius;
    }
    public String getCenterPoint(){
        String center;
        center = ("(" + centerPoint[0] + ", " + centerPoint[1] + ")");
        return center;
    }

    public double computeArea(){
        double area;
        area = Math.PI * (radius * radius);
        return area;
    }

}
