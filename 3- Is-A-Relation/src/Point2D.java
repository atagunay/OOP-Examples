
//This class will be used to represent "a single point" in 2D coordinate system!

public class Point2D {
    private int x;
    private int y;

    // We will assume that the upper left corner of the screen is (0,0)
    public Point2D() {
        x = -1;
        y = -1;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
