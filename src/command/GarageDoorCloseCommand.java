package command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garagedoor;

    public GarageDoorCloseCommand(GarageDoor garagedoor) {
        this.garagedoor = garagedoor;
    }

    @Override
    public void execute() {
        garagedoor.close();
    }
}