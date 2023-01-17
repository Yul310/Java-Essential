package objects;

public class HomeAreaCalculatorWithMethods {
    public static void main(String[] args){

        Rectangle kitchen = new Rectangle(length:200, width:400);
        Rectangle bathroom = new Rectangle(length:300, width:700);

    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() +rectangle2.calculateArea();
    }
}
