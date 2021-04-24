/*
    1) Circle class has "IS-A" relation with Shape Class
    2) Circle is a SUB-Class of Shape class
    3) Circle class DERIVES FROM Shape class
    4) Circle INHERIT everything from Shape class
    5) First super/base class constructor process, then sub/derived class constructor process
    6) In Java, super keyword is used to denote Super Class. If you put function call operator alongside the super
        keyword this means Constructor call of the super class!
    7) Super class constructor call MUST BE THE FIRST LINES of code of the sub-class constructor
    8) In Java, a class may have one-and-only-one direct super class!
 */

public class Circle extends Shape{

    // Even if you do not anything into this Circle class,
    // It will have startingPoint and endingPoint features from Shape class
    // They will all be inherited

    private  int radius;

    //Default Constructor
    public Circle() {
        //Firstly, Shape class constructor and then Circle class constructor called;
        //Because Circle extends Shape (IS - A - RELATION)
        radius = 0;
    }

    //One Parameter Parametric Constructor
    public Circle(int radius) {
        //You may think that there is a hidden line like below here
        // super();

        // Default constructor of Shape will be called here
       this.radius = radius;
    }

    //Three Parameter Parametric Constructor
    public Circle(Point2D startingPoint, Point2D endingPoint, int radius) {
        // This can be interpreted as CALL to the Super class' two parameter constructor!
        super(startingPoint, endingPoint);// THIS LINE MUST BE FIRST LINE OF YOUR CONSTRUCTOR
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public  double CalculateArea(){
        return Math.PI * radius * radius;
    }
    public double CalculateCircumference(){
        return 2 * Math.PI * radius;
    }
}
