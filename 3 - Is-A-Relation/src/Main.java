public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D start = new Point2D(0,0);
        Point2D end = new Point2D(100,100);

        Circle circle_def = new Circle(); // Default Constructor is called
        Circle circle_radius = new Circle(10); //One parameter Constructor is called
        Circle circle_all = new Circle(start,end,20); //three parameter Constructor is called

        System.out.printf("Circle_def --> radius: %d, its circumference: %e, its area: %e\n",
                circle_def.getRadius(),circle_def.CalculateCircumference(),circle_def.CalculateArea());

        System.out.printf("Circle_radius --> radius: %d, its circumference: %e, its area: %f\n",
                circle_radius.getRadius(),circle_radius.CalculateCircumference(),circle_radius.CalculateArea());

        System.out.printf("Circle_all --> radius: %d, its circumference: %e, its area: %e\n",
                circle_all.getRadius(),circle_all.CalculateCircumference(),circle_all.CalculateArea());
    }


}
