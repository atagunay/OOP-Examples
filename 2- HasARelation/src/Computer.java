public class Computer {

    Ram ram;
    Cpu cpu;
    Disc disc;

    public Computer() {
        cpu = new Cpu();
        ram = new Ram();
        disc = new Disc();

    }

    public Computer(Ram ram, Cpu cpu, Disc disc) {
        this.ram = ram;
        this.cpu = cpu;
        this.disc = disc;
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

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }
}
