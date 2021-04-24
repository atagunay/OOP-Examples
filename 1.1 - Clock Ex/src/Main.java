public class Main {

    public static void main(String[] args) {


        MyClockDriver myClockDriver;   //A REFERENCE
        MyClockDriver myClockDriver2;  //A REFERENCE
        MyClockDriver myClockDriver3;

        //Create a object using DEFAULT CONSTRUCTOR
        // And its adress will be stored in REFERENCE!
        myClockDriver = new MyClockDriver();

        //Create a object using PARAMETRIC CONSTRUCTOR
        // And its adress will be stored in REFERENCE!
        myClockDriver2 = new MyClockDriver(12,34,56);

        //Create a object using PARAMETRIC CONSTRUCTOR
        // And its adress will be stored in REFERENCE!
        myClockDriver3 = new MyClockDriver(56,78,89);

        System.out.printf("First clock is %d:%d:%d\n",myClockDriver.getHour(),
                                                    myClockDriver.getMinute(),
                                                    myClockDriver.getSecond());

        System.out.printf("Second clock is %d:%d:%d\n",myClockDriver2.getHour(),
                                                  myClockDriver2.getMinute(),
                                                  myClockDriver2.getSecond());

        System.out.printf("Third clock is %d:%d:%d\n",myClockDriver3.getHour(),
                                                    myClockDriver3.getMinute(),
                                                    myClockDriver3.getSecond());

    }
}
