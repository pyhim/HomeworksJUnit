package homeworks.flashlight;

public class Battery {
    private int charge;

    public Battery(int charge) {
        this.charge = charge;
    }

    public boolean isAlive() {
        return this.charge > 0;
    }

    public boolean decreaseCharge(int value) {
        if (this.charge > 0) {
            this.charge -= value;
            return true;
        } else {
            return false;
        }
    }
}
