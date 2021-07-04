package Bird;

import java.awt.*;
import java.util.Scanner;

public class Main {
    protected static int ov_x;
    protected static int ov_y;
    protected static int ov_cyr;
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Выделяемая окружность. Координата х - ");
        ov_x = in.nextInt();
        System.out.print("Выделяемая окружность. Координата у - ");
        ov_y = in.nextInt();
        System.out.print("Размер окружности - ");
        ov_cyr = in.nextInt();

        New p1 = new New();
//        New p8 = new New(0,0,30, Color.cyan);
//        Bird b1 = new Bird();
//        b1.fly(); //инкапсуляция
//        b1.fly();
//        b1.fly();
        Parrot p2 = new Parrot();
        Parrot p3 = new Parrot();
        Parrot p4 = new Parrot();
//        p1.fly(); //инкапсуляция + наследование
//        p1.speak();
        //  p1.name = "noKesha";
//        p1.setName("noKesha");
//        p1.speak();
//        System.out.println(p1.getName());
//        Parrot p2 = new Parrot("Gosha"); // не выводит имя Гоша

        Vor d5 = new Vor();
        Penguin p5 = new Penguin();
        Penguin p6 = new Penguin();
        Penguin p7 = new Penguin();
//        p4.fly();

//        System.out.println(p4 instanceof Penguin);
//        System.out.println(p4 instanceof Bird);
//        System.out.println(p4 instanceof Object);

//    Bird[] arr = {p2,p2,p4,p4};
//    for(int i = 0; i < arr.length; i++)
//        arr[i].fly(); // полиморфизм
//    }
//        ArrayList<Bird> flock = new ArrayList<Bird>();
//        flock.add(p2);
//        flock.add(p2);
//        flock.add(p4);
//        flock.add(p4);
//        for (int i = 0; i < flock.size(); i++)
//            (flock.get(i)).fly();
//
//        Bird.printNum();
//        p4.printNum();
//
//        p2.hello(p1);


        group g1 = new group();
        group g2 = new group();
        g1.add(p1);
        g1.add(p2);
        g1.add(p3);
        g1.add(p4);
        g1.add(p5);
        g1.add(p6);
        g1.add(p7);
//        g1.add(p8);
        g1.add(d5);

//        g1.fly();

        MyFrame frame = new MyFrame(g1);
//
    }

}
// ۶ (•●)…:::★☆★☆▬▬███[̲̅б̲̅][̲̅а̲̅][̲̅б̲̅][̲̅а̲̅][̲̅х̲̅][̲̅!̲̅]███▬▬☆★☆★:::…(๏̯͡๏)۶


