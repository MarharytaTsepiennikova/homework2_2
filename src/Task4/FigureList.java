package Task4;

public class FigureList {

    Figure[] list = new Figure[50];
    private int position = 0;

    public void add(Figure figure){
        list[position++] = figure;
    }

    public double getMaxSquare(double square){
        double result = 0;
        for (int index = 0; index < position; index++) {
            if (list[index] > result){
                result = list[index]
            }
        }
        return result;
    }

    public double getMinSquare(double square){
        double result = 0;
        for (int index = 0; index < position; index++) {
            if (list[index] < list[0]){
                list[0] = list[index];
            }
            result = list[0];
        }
        return result;
    }
}
