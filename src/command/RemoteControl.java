package command;

public class RemoteControl {
	public static void main(String[] args)
	{
		SimpleRemoteControl remote = new SimpleRemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenlight = new Light();
        Fan ceilingfan = new Fan();
        GarageDoor garagedoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomlightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomlightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenlightOn = new LightOnCommand(kitchenlight);
        LightOffCommand kitchenlightOff = new LightOffCommand(kitchenlight);
        FanHighCommand fanhigh = new FanHighCommand(ceilingfan);
        FanLowCommand fanlow = new FanLowCommand(ceilingfan);
        GarageDoorOpenCommand garagedooropen = new GarageDoorOpenCommand(garagedoor);
        GarageDoorCloseCommand garagedoorclose = new GarageDoorCloseCommand(garagedoor);
        StereoOnCommand stereoon = new StereoOnCommand(stereo);
        StereoOffCommand stereooff = new StereoOffCommand(stereo);

        remote.setCommand(livingRoomlightOn);
        remote.buttonWasPressed();
        remote.setCommand(livingRoomlightOff);
        remote.buttonWasPressed();

        remote.setCommand(kitchenlightOn);
        remote.buttonWasPressed();
        remote.setCommand(kitchenlightOff);
        remote.buttonWasPressed();

        remote.setCommand(fanhigh);
        remote.buttonWasPressed();
        remote.setCommand(fanlow);
        remote.buttonWasPressed();

        remote.setCommand(garagedooropen);
        remote.buttonWasPressed();
        remote.setCommand(garagedoorclose);
        remote.buttonWasPressed();

        remote.setCommand(stereoon);
        remote.buttonWasPressed();
        remote.setCommand(stereooff);
        remote.buttonWasPressed();
	} 
}
