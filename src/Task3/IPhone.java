package Task3;

public class IPhone extends Phone {

    protected String imei;
    protected String number = "050-111-22-33";

    public IPhone(){
        touch = true;
        hasWifi = true;
        screenSize = 3;
    }

    @Override
    final public void call(String number) {
        System.out.println("IPhone class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone class is sending sms: " + message + " to " + number);
    }
}
