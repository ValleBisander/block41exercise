import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends JComponent{
    private ArrayList<Polygon> polygons;
    private boolean direction = true;
    private int ticker = 0;
    public JFrame frame;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);

        polygons.add(new Square(new Point(50,50)));
        polygons.add(new Triangle(new Point(100,100)));
        polygons.add(new Rectangle(new Point(50,150)));

    }//constructor

    public void update(){
        ticker++;
        int value = direction ? 10 : -10;
        for (Polygon p: polygons){
            p.updateCenter(p.centerPoint.x+value, p.centerPoint.y+value);
            frame.repaint();
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
    }

    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

}//DrawPolygons