// Device Interface
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete Device Implementations
class TV implements Device {
    public void turnOn() {
        System.out.println("TV is ON.");
    }

    public void turnOff() {
        System.out.println("TV is OFF.");
    }
}

class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio is ON.");
    }

    public void turnOff() {
        System.out.println("Radio is OFF.");
    }
}

// Abstraction (RemoteControl)
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
}

// Refined Abstraction (Concrete RemoteControl)
class BasicRemote extends RemoteControl {
    private boolean on = false;

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (on) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        on = !on;
    }
}

// Main class to demonstrate Bridge Pattern
public class Bridge{
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl remote = new BasicRemote(tv);
        remote.togglePower(); // TV is ON
        remote.togglePower(); // TV is OFF

        remote = new BasicRemote(radio);
        remote.togglePower(); // Radio is ON
        remote.togglePower(); // Radio is OFF
    }
}
