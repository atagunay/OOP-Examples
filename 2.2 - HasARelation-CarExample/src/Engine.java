public class Engine {
    private int fuelType;
    private int horsePower;

    public final int FUEL_GAS = 0;
    public final int FUEL_DIESEL = 1;
    public final int FUEL_LPG = 2;
    public final int FUEL_UNKNOWN = 3;

    public Engine(){
        fuelType = FUEL_UNKNOWN;
        horsePower = 0;
    }

    public Engine(int fuelType, int horsePower){
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getFuelType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelString(){

        if(fuelType == 0){
            return "UNKNOWN";
        }
        else if(fuelType == 1){
            return "DIESEL";
        }
        else if(fuelType == 2){
            return "LPG";
        }

        return "UNKNOWN";
    }

    public void PrintEngine(){
        System.out.println("The type of this engine is: " + getFuelString());
        System.out.println("The horsepower of this engine is: " + getHorsePower());

    }
}
