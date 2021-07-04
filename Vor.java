package Bird;
import java.awt.*;
public class Vor extends Bird{
    private static int _num = 0;
    public Vor(){
        size = 5;
        color = new Color(151, 107, 107);
        System.out.println("x = " + x + ", y = " + y);
        _num ++;
        System.out.println("Я Воробей и меня " + _num);
    }
}
