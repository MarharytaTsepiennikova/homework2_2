package Task3;

public class SamsungS4 extends Phone {

    protected String number = "050-321-12-31";

    public SamsungS4(){
        hasWifi = true;
        touch = true;
        screenSize = 5;
    }

    @Override
    public void call(String number) {
        System.out.println("SamsungS4 class is calling " + number);    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone class is sending sms: " + "Hello " + message + " to " + number);
    }
}
