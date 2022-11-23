import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Square extends Polygon {
    public Square(Point center) {
        super(center);
    }

   @Override
    public void paint(Graphics g){
        g.drawRect(centerPoint.x - 10, centerPoint.y - 10, 20, 20);
    }
}
