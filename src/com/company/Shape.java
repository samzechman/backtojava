package com.company;

public class Shape {
    public static void main(String[] args) {
        Circle a = new Circle();

        a.setRadius(5.6);
        System.out.println( a.getRadius() );

        a.setCenterPoint(4.3, 2.1);
        System.out.println( a.getCenterPoint() );

        System.out.println( a.computeArea() );
    }

}
