public class Main {

    public static void main(String[] args) {

        /*
         * Intern - Class Relationships
         * 1) HAS - A relation
         * 2) IS - A INHERITANCE
         */

        Computer myComputer1 = new Computer();

        System.out.println("*********************** @ myComputer1 @ ***********************");
        System.out.println("Ram speed: " + myComputer1.getRam().getSpeed());
        System.out.println("Ram size: " + myComputer1.getRam().getSize());
        System.out.println("Cpu speed: " + myComputer1.getCpu().getMhz());
        System.out.println("Cpu cache size: " + myComputer1.getCpu().getCacheSize());
        System.out.println("Cpu cache size: " + myComputer1.getCpu().getManufacturer());

        Ram ram = new Ram(3200,64);
        Cpu cpu = new Cpu(4000,70,"AMD");
        Computer myComputer2 = new Computer(ram,cpu);

        System.out.println("*********************** @ myComputer2 @ ***********************");
        System.out.println("Ram speed: " + myComputer2.getRam().getSpeed());
        System.out.println("Ram size: " + myComputer2.getRam().getSize());
        System.out.println("Cpu speed: " + myComputer2.getCpu().getMhz());
        System.out.println("Cpu cache size: " + myComputer2.getCpu().getCacheSize());
        System.out.println("Cpu cache size: " + myComputer2.getCpu().getManufacturer());




    }
}
