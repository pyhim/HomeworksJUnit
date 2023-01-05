package homeworks.flashlight;

public class FlashLight {
    private Battery battery;
    private boolean status = false;

    public FlashLight(int charge) {
        this.battery = new Battery(charge);
    }

    public boolean turnOn() {
        if (this.battery.isAlive()) {
            this.status = true;
            return this.battery.decreaseCharge(1);
        } else {
            return false;
        }
    }

    public boolean turnOff() {
        this.status = false;

        return true;
    }
}
