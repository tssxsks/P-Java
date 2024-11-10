import java.awt.Point;

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points){
        this.points = points;
    }

    public double getArea(){
        int n = points.length;
        double area = 0.0;
        for(int i = 0; i < n; i++){
            int x1 = points[i].x;
            int y1 = points[i].y;
            int x2 = points[(i + 1) % n].x;
            int y2 = points[(i + 1) % n].y;

            area += (x1 * y2 - y1 * x2);
        }
        area = Math.abs(area) / 2.0;
        return area;
    }
}
