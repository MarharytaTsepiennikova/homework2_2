/**
 * Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов,
 * поддержкой Wifi и методом отправки SMS, который будет дописывать к сообщению слово “Hello”.
 *
 * Модифицироватькласс Phone так,чтобы он считал количество звонков и сообщений отдельно для каждого объекта.
 *
 * Написать код для связи телефонов между собой. У каждого телефона будет свой номер. При вызове call(x)
 * телефон должен найти собеседника по номеру x из всех доступных в данный момент телефонов
 * (из всех созданных объектов типа Phone) и вызвать его метод answer().
 */
package Task3;

public class MainClass {
    public static void main(String[] args) {
        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
        nokia.call("519-21-21");
        nokia.sendSMS("067-123-12-12", "I love you");

        System.out.println("_______________");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screen size: " + iphone.getScreenSize());
        iphone.call("097-123-12-12");
        iphone.sendSMS("067-432-31-31", "How are you?");

        System.out.println("_______________");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone5 screen size: " + iphone5.getScreenSize());
        iphone5.call("093-143-41-41");
        iphone5.sendSMS("068-41-41", "buy a tickets");

        System.out.println("_______________");

        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
        samsungS4.call("093-093-93-93");
        samsungS4.sendSMS("063-63-63", "keep your hands off my books");

        System.out.println("_______________");

        System.out.println(Phone.countCalls + " objects created");
    }
}
