package Task2;

import java.util.Date;

public class StudentList {
    protected Student[] list = new Student[100];
    private int p = 0;

    public void add(Student s){
        list[p++] = s;
        if (p + 1 == list.length){
            Student[] newList = new Student[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
    }

    public Student get(int n){
        return list[n];
    }

    public int findByName(String name){
        for (int index = 0; index < p; index++) {
            if(list[index].getName().equalsIgnoreCase(name)){
                return index;
            }
        }
        return -1;
    }

    public int findBySurname(String surname){
        for (int index = 0; index < p; index++) {
            if(list[index].getSurname().equalsIgnoreCase(surname)){
                return index;
            }
        }
        return -1;
    }

    public int findByDate(Date date){
        for (int index = 0; index < p; index++) {
            if(list[index].getBirth().equals(date)){
                return index;
            }
        }
        return -1;
    }

    public void delete(int indexOfStudent){
        if(indexOfStudent < 0 || indexOfStudent > list.length){
            return;
        }
        Student[] newList = new Student[list.length - 1];
        System.arraycopy(list, 0, newList, 0, indexOfStudent);
        System.arraycopy(list, indexOfStudent + 1, newList, indexOfStudent, newList.length - indexOfStudent);
        list = newList;
    }
}
