package com.jack.huncho;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class Tree extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        drawTree((Graphics2D) g, 300, 450, 400, 450, 0);
    }

    private void drawTree(Graphics2D g, float x1, float y1, float x2, float y2,
                          int depth) {

//        If
        if (depth == 10)
            return;

        float dx = x2 - x1;
        float dy = y1 - y2;

        float x3 = x2 - dy;
        float y3 = y2 - dx;
        float x4 = x1 - dy;
        float y4 = y1 - dx;
        float x5 = x4 + 0.5F * (dx - dy);
        float y5 = y4 - 0.5F * (dx + dy);

        Path2D square = new Path2D.Float();
        square.moveTo(x1, y1);
        square.lineTo(x2, y2);
        square.lineTo(x3, y3);
        square.lineTo(x4, y4);
        square.closePath();


        g.fill(square);
        g.draw(square);

        Path2D triangle = new Path2D.Float();
        triangle.moveTo(x3, y3);
        triangle.lineTo(x4, y4);
        triangle.lineTo(x5, y5);
        triangle.closePath();


        g.fill(triangle);
        g.draw(triangle);

        drawTree(g, x4, y4, x5, y5, depth + 1);
        drawTree(g, x5, y5, x3, y3, depth + 1);
    }
}
