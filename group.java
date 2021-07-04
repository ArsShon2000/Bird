package Bird;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class group {
    private ArrayList<Bird> _array;

    public group() {
        _array = new ArrayList<Bird>();
//        _array.add(new Parrot());
//        _array.add(new Parrot());
//        _array.add(new Penguin());
//        _array.add(new Penguin());

    }

    public void add(Bird p) {
        _array.add(p);

    }


    public void fly() {
        for (int i = 0; i < _array.size(); i++) {
            _array.get(i).fly();
        }
    }
    public void draw(Graphics g) {
        for (int i = 0; i < _array.size(); i++) {
            _array.get(i).draw(g);
        }
    }
}





