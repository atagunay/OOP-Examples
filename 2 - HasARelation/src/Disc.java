import java.util.PrimitiveIterator;
import java.util.SimpleTimeZone;

public class Disc {
    private int size; // "as GB" 256 GB, 512 GB, 1TB = 1024 GB
    private int type; // 0 --> UNKNOWN, 1 --> HDD, 2 --> SSD, 3-->NVME

    public final int UNKNOWN = 0;
    public final int HDD = 1;
    public final int SSD = 2;
    public final int NVME = 3;

    public Disc(){
        size = 0;
        type = 0;
    }

    public Disc(int size, int type){
        this.size = size;
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public int getType() {
        return type;
    }

    public String getTypeString(){

        if(type == 0){
            return "UNKNOWN";
        }
        else if(type == 1){
            return "HDD";
        }
        else if(type == 2){
            return "SSD";
        }
        else if(type == 3){
            return "NVME";
        }

        return "UNKNOWN";
    }
}
