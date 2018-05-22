package Task1;

public class Car {
    private String name;
    private Engine engine;
    private Climate climate = new Climate();

    public Car(String name){
        this.name = name;
        engine = new Engine(124,75);
    }

    public String getName(){
        return name;
    }

    public double getMileage(){
        return engine.getMileage();
    }

    public void turnOn(){
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(24);
    }

    public void turnOff(){
        engine.turnOff();
        climate.turnOff();
    }

    public void start(int speed, double hours){
        if (engine.isStarted()){
            double distance = hours * speed;
            engine.addMileage(distance);
        }
    }
}
