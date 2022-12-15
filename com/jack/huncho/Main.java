package com.jack.huncho;





import javax.swing.*;


public class Main extends JComponent {

    public static void main(String[] args) {
//        Create frame (can be called canvas)
        JFrame frame = new JFrame("Pythagoras Tree");
//        Set size of the frame
        frame.setSize(700, 700);
//        Create your drawable object
        Tree tree = new Tree();
//        Add your drawable object to the frame
        frame.add(tree);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Output your frame
        frame.setVisible(true);
    }
}
