package be.intecbrussel.exercises.factoryexercise;

public abstract class Computer {
    private String ram;
    private String cpu;
    private String hdd;

    public Computer(String ram, String cpu, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
