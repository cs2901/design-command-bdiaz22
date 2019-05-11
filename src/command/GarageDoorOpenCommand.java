package command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garagedoor;

    public GarageDoorOpenCommand(GarageDoor garagedoor) {
        this.garagedoor = garagedoor;
    }

    @Override
    public void execute() {
        garagedoor.open();
    }
}