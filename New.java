package Bird;
import java.awt.*;
import java.util.Scanner;

public class New extends Bird {

//    Scanner in = new Scanner(System.in);
    public New(){


//        int ov_x = in.nextInt();
//        int ov_y = in.nextInt();
//        int ov_cyr = in.nextInt();
        color = new Color(158, 36, 180);
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(ov_x, ov_y, ov_cyr, ov_cyr);
    }

    public New(int ov_x,int ov_y,int ov_cyr) {

        this.ov_x = ov_x;
        this.ov_y = ov_y;
        this.ov_cyr = ov_cyr;
        color = new Color(161, 67, 67);

    }
    public New(int ov_x,int ov_y,int ov_cyr, Color color) {
        this.color = color;
        this.ov_x = ov_x;
        this.ov_y = ov_y;
        this.ov_cyr = ov_cyr;
        color = new Color(161, 67, 67);

    }


}
