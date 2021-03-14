public class Computer {

    Ram ram;
    Cpu cpu;

    public Computer() {
        cpu = new Cpu();
        ram = new Ram();
    }

    public Computer(Ram ram, Cpu cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
