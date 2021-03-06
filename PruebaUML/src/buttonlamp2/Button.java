package buttonlamp2;

public class Button {
    IActivable lamp;
    boolean lampStatus;

    public Button(IActivable lamp) {
        this.lamp = lamp;
        this.lampStatus = false;
    }

    public void click() {
        if (!lampStatus) {
            lampStatus = true;
            lamp.turnOn();
        } else {
            lampStatus = false;
            lamp.turnOff();
        }
    }
}
