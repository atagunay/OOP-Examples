import java.security.PublicKey;
import java.util.concurrent.RecursiveTask;

public class Seat {
    private int type;
    private int material;

    public final int TYPE_SPORT = 0;
    public final int TYPE_NORMAL = 1;
    public final int TYPE_UNKNOWN = 2;

    public final int MATERIAL_FABRIC = 0;
    public final int MATERIAL_LEATHER = 1;
    public final int MATERIAL_UNKNOWN = 2;

    public Seat(int type, int material) {
        this.type = type;
        this.material = material;
    }

    public Seat() {
        type = TYPE_UNKNOWN;
        material = MATERIAL_UNKNOWN;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public String getTypeString(){
        if(type == 0){
            return "SPORT";
        }
        else if(type == 1){
            return "NORMAL";
        }
        else if (type == 2){
            return "UNKNOWN";
        }

        return "UNKNOWN";
    }
    public String getMaterialString(){
        if(material == 0){
            return "FABRIC";
        }
        else if(material == 1){
            return "LEATHER";
        }
        else if (material == 2){
            return "UNKNOWN";
        }

        return "UNKNOWN";
    }

    public void PrintSeat(){
        System.out.println("The type of this seat is: " + getTypeString());
        System.out.println("The material of this seat is: " + getMaterialString());
    }
}
