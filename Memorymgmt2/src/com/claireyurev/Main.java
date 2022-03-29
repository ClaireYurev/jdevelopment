package com.claireyurev;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	        Point point1 = new Point(1,1);
            Point point2 = point1;
                System.out.println("Point1 is: ");
                    System.out.println(point1);
                System.out.println("Point2 is: ");
                    System.out.println(point2);
            point1.x = 2;
            System.out.println("Point1.x has been reassigned!");
                System.out.println("Point1 is: ");
                    System.out.println(point1);
                System.out.println("Point2 is: ");
                System.out.println(point2);
    }
}
