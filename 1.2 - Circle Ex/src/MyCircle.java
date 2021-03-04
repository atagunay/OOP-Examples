public class MyCircle {

    private  int radius;

    //DEFAULT CONSTRUCTOR
    public MyCircle(){
        radius = 0;
    }

    //PARAMETRIC CONSTRUCTOR
    public MyCircle(int r){
        radius = r;
    }

    public void SetRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    //FORMULA = 2 x PI x READIUS
    public double CalculateCircumreference(){
        return (2* Math.PI * radius);
    }

    //FORMULA = PI x READIUS x READIUS
    public double CalculateArea(){
        return (Math.PI * radius * radius);
    }
}
