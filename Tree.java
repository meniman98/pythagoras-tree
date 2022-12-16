package com.jack.huncho;

import ui.TreeWindowUserInterface;



public class Tree {

    private static final double degrees90 = 1.57079633;


    public static void drawTree(TreeWindowUserInterface ui, int length, double angle, int depth) {
        if (depth == 5) {
            return;
        }

//        1. P to Q
        ui.drawLine(length);
//        2. Pythagoras tree in Q
        ui.turnLeft(angle);
        drawSquare(ui, length);
//        3. Q to S
        ui.drawLine(length);
//        4. Pythagoras tree in S
        ui.turnRight(angle);
        drawSquare(ui, length);


    }

    private static void drawSquare(TreeWindowUserInterface ui, int length) {
        ui.drawLine(length);
        ui.turnRight(degrees90);
        ui.drawLine(length);
        ui.turnRight(degrees90);
        ui.drawLine(length);
        ui.turnRight(degrees90);
        ui.drawLine(length);
    }

    public static void setOrigin(TreeWindowUserInterface ui) {
        ui.turnRight(degrees90);
        ui.drawLine(200);
        ui.turnLeft(degrees90);
        ui.drawLine(200);
        ui.turnLeft(degrees90);
    }
}
