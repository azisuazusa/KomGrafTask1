import groovyjarjarantlr4.v4.misc.Graph;

import java.awt.*;

public class StarCircleFlip {

    public StarCircleFlip(Graphics2D graphics2D) {
        draw(graphics2D, 0, 0);
    }

    public StarCircleFlip(Graphics2D graphics2D, int x, int y) {
        draw(graphics2D, x, y);
    }

    private void draw(Graphics2D graphics2D, int x, int y) {
        graphics2D.setColor(Color.BLACK);
        graphics2D.setStroke(new BasicStroke(4));
        graphics2D.drawOval(16 + x, 16 + y, 150, 150);
        graphics2D.setStroke(new BasicStroke(10));
        graphics2D.drawPolygon(new Polygon(getStarXCoordinates(x, y), getStarYCoordinates(x, y), 5 * 2));
    }

    private int[] getStarXCoordinates(int x, int y) {
        int[] res = new int[5 * 2];
        double addAngle = 2 * Math.PI / 5;
        double angle = 1.6;
        double innerAngle = 1.6 + Math.PI / 5;
        for (int i = 0; i < 5; i++) {
            res[i * 2] = (int) Math.round(50 * Math.cos(angle)) + 90 + x;
            angle += addAngle;
            res[i * 2 + 1] = (int) Math.round(20 * Math.cos(innerAngle)) + 90 + y;
            innerAngle += addAngle;
        }
        return res;
    }

    private int[] getStarYCoordinates(int x, int y) {
        int[] res = new int[5 * 2];
        double addAngle = 2 * Math.PI / 5;
        double angle = 1.6;
        double innerAngle = 1.6 + Math.PI / 5;
        for (int i = 0; i < 5; i++) {
            res[i * 2] = (int) Math.round(50 * Math.sin(angle)) + 90 + x;
            angle += addAngle;
            res[i * 2 + 1] = (int) Math.round(20 * Math.sin(innerAngle)) + 90 + y;
            innerAngle += addAngle;
        }
        return res;
    }
}
