package Task3;

public class Nokia3310 extends Phone {

    protected String number = "050-333-11-22";

    public Nokia3310(){
        touch = false;
        hasWifi = false;
        screenSize = 2;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Nokia3310 class is calling" + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Nokia3310 class is sending sms: " + message + " to " + number);
    }
}
