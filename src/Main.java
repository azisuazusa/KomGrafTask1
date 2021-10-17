import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        new StarCircleFlip(graphics2D);
    }
}
