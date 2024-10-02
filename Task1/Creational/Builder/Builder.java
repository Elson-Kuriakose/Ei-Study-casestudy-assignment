// Computer class
class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    public Computer(String CPU, String RAM, String storage) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + "]";
    }
}

// Builder for Computer
class ComputerBuilder {
    private String CPU;
    private String RAM;
    private String storage;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, RAM, storage);
    }
}

// Main class to demonstrate Builder Pattern
public class Builder {
    public static void main(String[] args) {
        Computer myComputer = new ComputerBuilder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println(myComputer);
    }
}
