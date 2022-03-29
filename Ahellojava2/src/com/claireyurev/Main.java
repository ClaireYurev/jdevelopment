package com.claireyurev;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //JFrame frame = new JFrame( "Hello, Java!");
        //JLabel label = new JLabel("Whatup whatup", JLabel.CENTER);
        //frame.add(label);
        //frame.setSize( 300,300 );
        //frame.setVisible( true );

        JFrame frame = new JFrame( "Title!");
        frame.add( new HelloComponent2("Hello, Java 2 !") );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 300,300 );
        frame.setVisible( true );
    }
}
