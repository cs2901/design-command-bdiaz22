package command;

public class GarageDoor {
    private boolean isOpen = false;
    public void  open(){
        isOpen = true;
        System.out.println("Garage door is "+isOpen);
    }

    public void close(){
        isOpen = false;
        System.out.println("Garage door is "+isOpen);
    }

}