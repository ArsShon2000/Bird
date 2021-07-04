package Bird;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public static final int width = 600;
    public static final int height = 600;
    public static final int margin = 20;


    public static final int w_field = width*(100 - margin)/100;
    public static final int h_field = height*(100 - margin)/100;


    private group group;

    public MyFrame(group group){
//        repaint();
        this.group = group;
        setSize(width, height);
        setTitle("BIRDS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100,100);
        setVisible(true);

//        не получилось
//        setBackground(new Color(123, 122, 122));
//        setBackground(Color.GRAY);
    }
    @Override
    public void paint(Graphics g){
//        g.setColor(new Color(0,0,0));
//        g.drawLine(0,0,40,40);
        this.setBackground(Color.CYAN);
//        g.drawOval(40,40,80,80);
//        g.setColor(Color.ORANGE);
//        g.fillOval(120,120,50,50);
        g.setColor(Color.BLACK);
////        g.drawLine(MyFrame.width/2,10,MyFrame.width/2,MyFrame.height);
////        g.drawLine(0,MyFrame.height/2,MyFrame.width,MyFrame.height/2);
        g.translate(MyFrame.width/2, MyFrame.height/2);
        g.drawLine(-MyFrame.width/2, 0, MyFrame.width/2, 0);
        g.drawLine(0, MyFrame.height/2, 0, -MyFrame.height);

        g.drawLine(-MyFrame.w_field/2, -MyFrame.h_field/2, MyFrame.w_field/2, -MyFrame.h_field/2);
        g.drawLine(-MyFrame.w_field/2, MyFrame.h_field/2, MyFrame.w_field/2, MyFrame.h_field/2);
        g.drawLine(-MyFrame.w_field/2, -MyFrame.h_field/2, -MyFrame.w_field/2, MyFrame.h_field/2);
        g.drawLine(MyFrame.w_field/2, -MyFrame.h_field/2, MyFrame.w_field/2, MyFrame.h_field/2);

        g.drawLine(-MyFrame.w_field/2, -MyFrame.h_field/2, 0, -MyFrame.h_field/2);
        g.drawLine(-MyFrame.w_field/2, MyFrame.h_field/2, 0, MyFrame.h_field/2);
        g.drawLine(-MyFrame.w_field/2, -MyFrame.h_field/2, -MyFrame.w_field/2, 0);
        g.drawLine(MyFrame.w_field/2, -MyFrame.h_field/2, MyFrame.w_field/2, 0);

        group.draw(g);

        g.setColor(Color.BLUE);

        g.drawLine(Penguin.x1 + 30, Penguin.y2 + 0, Penguin.x1 + 30, Penguin.y1 + 30);
        g.drawLine(Penguin.x1 + 30, Penguin.y1 + 30, Penguin.x2 + 0, Penguin.y1 + 30);
        g.drawLine(Penguin.x2 + 0, Penguin.y1 + 30, Penguin.x2 + 0, Penguin.y2 + 0);
        g.drawLine(Penguin.x2 + 0, Penguin.y2 + 0, Penguin.x1 + 30, Penguin.y2 + 0);


        g.setColor(Color.RED);
        g.drawLine(Parrot.x11 + 15, Parrot.y22 + 0, Parrot.x11 + 15, Parrot.y11 + 15);
        g.drawLine(Parrot.x11 + 15, Parrot.y11 + 15, Parrot.x22 + 0, Parrot.y11 + 15);
        g.drawLine(Parrot.x22 + 0, Parrot.y11 + 15, Parrot.x22 + 0, Parrot.y22 + 0);
        g.drawLine(Parrot.x22 + 0, Parrot.y22 + 0, Parrot.x11 + 15, Parrot.y22 + 0);
    }
//    public void paint(Graphics d){
//        group.draw(d);
//    }
}
