/**
 * Сделать поиск по фамилии
 * Сделать поиск по дате рождения
 * Сделать функцию удаления студента из списка
 * Предусмотреть выход за пределы списка
 */
package Task2;

import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        final StudentList sl = new StudentList();

        sl.add(new Student("Vova", "Ivanov", new Date(1986, 1, 1)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1991, 10, 14)));

        int n = sl.findByName("Vova");
        System.out.println(sl.get(n).getBirth().toString());

        int m = sl.findBySurname("Pupkin");
        System.out.println(sl.get(m).getBirth().toString());

        int b = sl.findByDate(new Date(1986, 1,1));
        System.out.println(sl.get(b).getName() + " " + sl.get(b).getSurname());

        sl.delete(1);
    }
}
