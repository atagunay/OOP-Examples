public class Ram {

    private int speed;
    private int size;

    /*
     *You can add constructor and get/set functions with ALT + INSERT key
     */

    //DEFAULT CONSTRUCTOR
    public Ram() {
        //You can use this.speed and this.size
        //But it is not necessary. Because this function hasn't got local parameter
        speed = 0;
        size = 0;
    }

    //PARAMETRIC CONSTRUCTOR
    public Ram(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //this.speed = Ram's speed
        //speed = setSpeed's speed
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        //this.size = Ram's size
        //size = setSpeed's size
        this.size = size;
    }
}
