public class Cpu {
    private int mhz;
    private int cacheSize;
    private String manufacturer;

    //DEFAULT CONSTRUCTOR
    public Cpu() {
        mhz = 0;
        cacheSize = 0;
        manufacturer = "UNKNOWN";
    }

    //PARAMETRIC CONSTRUCTOR
    public Cpu(int mhz, int cacheSize, String manufacturer) {
        this.mhz = mhz;
        this.cacheSize = cacheSize;
        this.manufacturer = manufacturer;
    }

    public int getMhz() {
        return mhz;
    }

    public void setMhz(int mhz) {
        this.mhz = mhz;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
