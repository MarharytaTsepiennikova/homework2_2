package Task4;

public class Rectangle extends Figure {
    double heigth;
    double weith;

    Rectangle(double heigth, double weith){
        this.heigth =  3.4;
        this.weith = 12.4;
    }

    @Override
    public double getSquare() {
        double result = heigth * weith;
        return result;
    }
}
