package Bird;

import java.awt.*;
import java.util.Scanner;

public abstract class Bird extends Main{
    protected int x,y;
    protected int null_x,null_y,R;
    protected int size;
    protected int size_puz;
    protected Color color;
    private static int _num = 0;




    public Bird (){
        R = ov_cyr/2;
         x = (int)(Math.random()*MyFrame.w_field - MyFrame.w_field/2);
         y = (int)(Math.random()*MyFrame.h_field - MyFrame.h_field/2);
        _num++;
//        System.out.println("I am Bird");
        color = new Color(250, 101, 101);
    }
    public void fly() {
        System.out.println("I can fly");
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }


    public static void printNum(){
        System.out.println("num = " + _num);
    }

}
