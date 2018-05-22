package Task1;

/**
 * Добавить свойство «объем двигателя» в класс Engine.
 * Написать код для вывода потраченного топлива на экран.
 */

public class Engine {

    private double mileage;
    private boolean started;
    private int engineCapacity;


    public Engine (double mileage, int engineCapacity){
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage (double mileage){
        if (started){
            this.mileage += mileage;
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn(){
        started = true;
    }

    public void turnOff(){
        started = false;
    }

    void calculationOfFuel(int engineCapacity, double mileage){
        double result;
        result = engineCapacity / mileage * 100;
        System.out.println(result);
    }

}
