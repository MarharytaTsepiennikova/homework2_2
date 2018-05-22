package Task4;

public class Circle extends Figure {
    double radius;

    Circle (double radius){
        this.radius = 5;
    }

        public double getSquare(){
            double result = Math.PI * radius * radius;
            return result;
        }

}
