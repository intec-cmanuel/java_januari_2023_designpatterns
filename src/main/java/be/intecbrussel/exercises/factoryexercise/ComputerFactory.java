package be.intecbrussel.exercises.factoryexercise;

public class ComputerFactory {
    public static Computer createComputer(String type, String ram, String cpu, String hdd) {
        switch(type.toUpperCase()) {
            case "PC":
                return new PC(ram, cpu, hdd);
            case "SERVER" :
                return new Server(ram, cpu, hdd);
            default:
                return null;
        }
    }
}
