package Bird;
import java.awt.*;

public class Penguin extends Bird {
    private static int _num = 0;
    public static int x1= -480;
    public static int y1= -480;
    public static int x2= 480;
    public static int y2= 480;
    public  Penguin(){
        size = 30;
        size_puz = 5;
        color = new Color(0,0,0);
        x = (int)(Math.random()*MyFrame.w_field - MyFrame.w_field/2);
        y = (int)(Math.random()*MyFrame.h_field - MyFrame.h_field/2);
        System.out.println("x = " + x + ", y = " + y);
        _num ++;
        System.out.println("Я пингвин и нас " + _num);
        null_x = ov_x + (ov_cyr/2);
        null_y = ov_y + (ov_cyr/2);
    }

    public void draw(Graphics g){
        if(x < x2) x2 = x;
        if(y < y2) y2 = y;
        if(x > x1) x1 = x; //-190
        if(y > y1) y1 = y;
//        if(x > 0) xx = x;
//        if(x < 0) xx = x * (-1);
//        if(y > 0) yy = x;
//        if(y < 0) yy = x * (-1);
        if ((x - null_x)*(x - null_x) + (y - null_y) * (y - null_y) <= R*R) {
            g.setColor(color);
            g.fillOval(x, y, size, size);
            g.setColor(new Color(255, 0, 0));
            g.fillOval(x + size / 4, y, size / 2, size);
        }
        else {
            g.setColor(color);
            g.fillOval(x, y, size, size);
            g.setColor(new Color(255, 255, 255));
            g.fillOval(x + size / 4, y, size / 2, size);
        }
    }





    @Override
    public void fly() {
        System.out.println("я не умею летать!" );
    }

}
