package com.nirzhor;

public class Main2 {

    public static void main(String[] args) {

        var point1 = new Point(1,2); // Reference types
        var point2 = new Point(1,2);
        /// point2 & point2 are address of Point object

        // System.out.println( point1 == point2); // Comparing Address
        // System.out.println( point1.equals(point2)); // Comparing Address

        // System.out.println( point1.equals( new TextBox()));
        // System.out.println( point1.equals(point1));
        System.out.println( point1.hashCode());
        System.out.println( point2.hashCode());

    }


}
