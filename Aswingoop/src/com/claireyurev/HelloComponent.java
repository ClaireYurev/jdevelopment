package com.claireyurev;

import javax.swing.*;
//import java.awt.*;
import java.awt.Graphics;

class HelloComponent extends JComponent {

    public void paintComponent(Graphics g){
        g.drawString("Whatup whatup!", 125, 95);
    }

}
