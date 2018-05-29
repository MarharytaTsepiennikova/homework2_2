package Task3;

public class IPhone5 extends IPhone {

    protected String number = "050-222-11-33";

    public IPhone5(){
        System.out.println("IPhone5 constructor");
        screenSize = 4;
        imei = "111123123";
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPnone5 class is sending sms: " + message + " to " + number);
    }
}
