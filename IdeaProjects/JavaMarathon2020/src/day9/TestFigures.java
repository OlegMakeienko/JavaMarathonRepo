package day9;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
          new Triangle(10,10,10,"Red"),
          new Triangle(10,20,30,"Green"),
          new Triangle(10,20,15,"Red"),
          new Rectangle(5,10,"Red"),
          new Rectangle(40,15,"Orange"),
          new Circle(4,"Red"),
          new Circle(10, "Red"),
          new Circle(5,"Blue")
        };
        System.out.println(areaOfRedFigures(figures));
        System.out.println(perimeterOfRedFigures(figures));
    }

    public static double perimeterOfRedFigures(Figure[] figures) {
        double sum = 0;

        for (Figure figure :
             figures ) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();
        }
        return sum;
    }
    public static double areaOfRedFigures(Figure[] figures) {
        double area = 0;

        for (Figure figure :
                figures) {
            if (figure.getColor().equals("Red"))
                area += figure.area();
        }
        return area;
    }
}
