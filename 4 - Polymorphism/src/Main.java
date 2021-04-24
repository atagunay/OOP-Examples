public class Main {

        //**************************************************************************************************************
        // POLYMORPHISM
        //**************************************************************************************************************
        // We need:
        // 1-) Inheritance
        // 2-) Overriding
        // 3-) Base class reference with a sub class object's adress
        // to implement polymorphic applications!

        //POLYMORPHISM = POLY + MORPH
        //               many + form
        //              (çok) + (biçim)


    // We want this function can take Circle or Rectangle as its parameter
    // You can access only the base class features.
    // You cant access derived class feature. Because shape reference have adress of shape class feature and override.
    public static  void drawSomething(Shape shape){
        shape.DrawShape();
    }

    public static void main(String[] args) {

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

        Shape shape_ref; // Shape reference points nowhere! It contains null!
        shape_ref = circle_all; // circle_all contains a circle object's adress

        // Reference type is Shape
        // But it contains a Circle object's adress
        // Reference LOOKS LIKE Shape BUT BEHAVES LIKE Circle!
        // This is POLYMORPHISM !!!
        shape_ref.DrawShape();

        Circle circ = new Circle();
        Rectangle rect = new Rectangle();
        Shape shapeObject = new Shape();

        drawSomething(circ);
        drawSomething(rect);
        drawSomething(shapeObject);

    }
}
