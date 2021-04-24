/*
    1) Rectangle class has "IS-A" relation with Shape Class
    2) Rectangle is a SUB-Class of Shape class
    3) Rectangle class DERIVES FROM Shape class
    4) Rectangle INHERIT everything from Shape class
 */

public class Rectangle extends Shape{

    @Override
    public void DrawShape() {
        System.out.println("This is Rectangle's DrawShape Method");
    }
}
