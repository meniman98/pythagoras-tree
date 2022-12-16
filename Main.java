package com.jack.huncho;





import ui.TreeWindowUserInterface;

import javax.swing.*;
import java.awt.*;


public class Main extends JComponent {

    public static void main(String[] args) {

//        Create frame (can be called canvas)
        TreeWindowUserInterface frame = new TreeWindowUserInterface();
//        Set size of the frame
//        Create your drawable object
        Tree.setOrigin(frame);
        Tree.drawTree(frame, 100, 0.785398, 10);
//        Add your drawable object to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Output your frame
        frame.setVisible(true);
    }
}
