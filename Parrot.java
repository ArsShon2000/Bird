package Bird;
import java.awt.*;

public class Parrot extends Bird{

    private String _name = "Kesha"; // пример переменной экземпляра/объекта класса
    private static int _num = 0; // пример пер класса (статик)

    public static int x11= -MyFrame.w_field; //480
    public static int y11= -MyFrame.w_field;
    public static int x22= MyFrame.w_field;
    public static int y22= MyFrame.w_field;
    public Parrot(){

        size = 15;
        color = new Color(53, 255, 0,15);
        x = (int)(Math.random()*MyFrame.w_field - MyFrame.w_field/2);
        y = (int)(Math.random()*MyFrame.h_field - MyFrame.h_field/2);
        _num++;
        null_x = ov_x + (ov_cyr/2);
        null_y = ov_y + (ov_cyr/2);;
        System.out.println("ov_syr " + ov_cyr);
        System.out.println("x = " + x + ", y = " + y );
        System.out.println("Я попугай и нас уже " + _num);
    }
    public void draw(Graphics g){
        if(x < x22) x22 = x;
        if(y < y22) y22 = y;
        if(x > x11) x11 = x; //-190
        if(y > y11) y11 = y;
//        if(x > 0) xx = x;
//        if(x < 0) xx = x * (-1);
//        if(y > 0) yy = x;
//        if(y < 0) yy = x * (-1);
        if ((x - null_x)*(x - null_x) + (y - null_y) * (y - null_y) <= R*R) {
            g.setColor(Color.yellow);
            g.fillOval(x, y, size, size);
        }
        else {
            g.setColor(color);
            g.fillOval(x, y, size, size);
        }
    }
    public void fly() { System.out.println("I can fly");


    }


    public Parrot(String name){

        _num++;
        _name = name;
        System.out.println("Я попугай и нас уже " + _num);
    }
    public void speak() {
        System.out.println("Меня зовут " + _name + "!");

    }
    //    public void rename(String name){
    public void setName(String name){
        //_name = name;
        this._name = name;
    }
    public String getName() {
        return _name;
    }

    public void hello(Parrot p){
        System.out.println("Привет "+ p._name + ", я " + _name);
    }
}

