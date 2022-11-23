import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Rectangle extends Polygon {
    
    public Rectangle(Point center) {
        super(center);
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
 
}
