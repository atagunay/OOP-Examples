public class Main {

    public static void main(String[] args) {

        //******************************************************
        System.out.println("##### CAR 1 #####");

        Car car1 = new Car();
        car1.printCarData();
        //******************************************************

        //******************************************************
        System.out.println("##### CAR 2 #####");

        Seat seat = new Seat(0,0);
        Engine engine = new Engine(1,120);

        Car car2 = new Car(engine,seat);
        car2.printCarData();
        //******************************************************


    }
}
