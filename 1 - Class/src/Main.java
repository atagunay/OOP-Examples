public class Main {

    public static void main(String[] args) {

        /* NOTE 00
         * DATA TYPES OF JAVA
         * 1-) Built-in / Simple types : int,long, float, double, char, etc.
         * 2-) Complex/compound/class types : Must be defined with "new" (new is like malloc)
         */


        /* NOTE 01
         * ACCESS MODIFIERS OF JAVA
         * 1-) public -> can be accessed from outside
         * 2-) private -> canNOT be reached from outside
         * 3-) protected -> Later!
         */

        /* NOTE 02
         * Java OBJECT is a class variable DYNAMICALLY ALLOCATED in MEMORY !!!
         */

        /* NOTE 03
         * PROPERTIES of a CONSTRUCTOR
         * 1-) A constructor must have exactly the same name as the class !
         * 2-) A constructor has not got return value concept! This means you shoul not even write void there!
         * 3-) Constructor functions are special kind of functions which will be called during the creation/allocation
         * of the class OBJECT!
         * 4-) Default constructor is constructor method which takes NO PARAMETERS! And it is the simplest version of
         * constructor!
         */

        //********************************************
        // CLASS / COMPLEX / COMPOUND TYPE
        //********************************************

        // FIRST WAY START
        // Define a "pen" reference and create a Pen object
        // Assign adress of Pen object to the pen reference
        // "()" for default constructor
        Pen pen = new Pen();
        //FIRS WAY END

        //SECOND WAY
        // Declaration for a CLASS type variable gives you a REFERENCE!
        // All the REFERENCES which do not point anywhere have "null" value
        Pen pen2;

        // pen2 is a Java REFERENCE
        // new Pen(); will allocate memory for a Pen OBJECT!
        // "new" is like C's malloc and it will dynamically allocate memory
        // "()" for default constructor
        pen2 = new Pen();
        //SECOND WAY END

        pen.SetColor("Red");

        System.out.println("color of pen is " + pen.GetColor());
    }
}
