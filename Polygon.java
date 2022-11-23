import javax.swing.*;
import java.awt.*;
import java.awt.font.GraphicAttribute;

/**
 * Created by Niklas on 2016-01-19.
 */
public abstract class Polygon extends JComponent{
    protected Point centerPoint;
    

    public Polygon(Point center){
        this.centerPoint = center;
        
    }
    
    public void updateCenter(int x, int y){
        this.centerPoint = new Point(x,y);
        
    }

    
    public abstract void paint(Graphics g)//paint
    ;
}
