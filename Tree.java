package com.jack.huncho;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class Tree extends JComponent {

    @Override
    protected void paintComponent(Graphics graphics) {
        drawPythagorasTree((Graphics2D) graphics, 300, 450, 400, 450, 0);
    }

    void drawPythagorasTree(Graphics2D graphics, float x1, float y1, float x2, float y2,
                          int depth) {

//        If depth is too low, stop the recursion
        if (depth == 10)
            return;

        float differenceInX = x2 - x1;
        float differenceInY = y1 - y2;

        float x3 = x2 - differenceInY;
        float y3 = y2 - differenceInX;
        float x4 = x1 - differenceInY;
        float y4 = y1 - differenceInX;
        float x5 = x4 + 0.5F * (differenceInX - differenceInY);
        float y5 = y4 - 0.5F * (differenceInX + differenceInY);

        Path2D square = new Path2D.Float();
        square.moveTo(x1, y1);
        square.lineTo(x2, y2);
        square.lineTo(x3, y3);
        square.lineTo(x4, y4);
        square.closePath();


        graphics.fill(square);
        graphics.draw(square);

        Path2D triangle = new Path2D.Float();
        triangle.moveTo(x3, y3);
        triangle.lineTo(x4, y4);
        triangle.lineTo(x5, y5);
        triangle.closePath();


        graphics.fill(triangle);
        graphics.draw(triangle);

        drawPythagorasTree(graphics, x4, y4, x5, y5, depth + 1);
        drawPythagorasTree(graphics, x5, y5, x3, y3, depth + 1);
    }
}
