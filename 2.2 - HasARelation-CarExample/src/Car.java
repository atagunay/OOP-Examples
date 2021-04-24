public class Car {

    Engine engine;
    Seat seat;

    public Car(Engine engine, Seat seat) {
        this.engine = engine;
        this.seat = seat;
    }

    public Car() {
        engine = new Engine();
        seat = new Seat();
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    public void printCarData(){
        seat.PrintSeat();
        engine.PrintEngine();
    }
}
