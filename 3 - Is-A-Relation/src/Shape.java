public class Shape {
    /*
     *                  sub-class           others
     * public              OK                 OK
     * protected           OK                 NOT
     * private             NOT                NOT
     *
     */

    // Q) WHEN WE SHOULD USE PROTECT MEMBERS?
    // A) If we want sub-classes to access members and not others, those members must be declared as protected.

    //Shape class HAS-A relation with Point2D class
    protected Point2D startingPoint; //upperLeft
    protected Point2D endingPoint;   //lowerRight

    public Shape() {
        startingPoint = new Point2D();
        endingPoint = new Point2D();
    }

    public Shape(Point2D startingPoint, Point2D endingPoint) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    public Point2D getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Point2D startingPoint) {
        this.startingPoint = startingPoint;
    }

    public Point2D getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(Point2D endingPoint) {
        this.endingPoint = endingPoint;
    }
}
