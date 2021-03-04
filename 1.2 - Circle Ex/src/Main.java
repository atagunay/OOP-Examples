public class Main {

    public static void main(String[] args) {

        //CREATE OBJ WITH DEFAULT CONSTRUCTOR
        MyCircle myCircle = new MyCircle();
        myCircle.SetRadius(20);

        //CREATE OBJ WITH PARAMETRIC CONSTRUCTOR
        MyCircle myCircle1 = new MyCircle(10);

        System.out.printf("mycircle's radius %d\n",myCircle.getRadius());
        System.out.printf("mycircle1's radius %d\n",myCircle1.getRadius());

        System.out.printf("mycircle's area: %e\n",myCircle.CalculateArea());
        System.out.printf("mycircle's circumference: %e\n",myCircle.CalculateCircumreference());

        System.out.printf("mycircle1's area: %e\n",myCircle1.CalculateArea());
        System.out.printf("mycircle1's circumference: %e\n",myCircle1.CalculateCircumreference());


    }
}
