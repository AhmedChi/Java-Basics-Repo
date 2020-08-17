public class MainTriangle {
    public static void main(String[] args) {

        Triangle triangleA = new Triangle(15,8,15,15,15);
        Triangle triangleB = new Triangle(3, 2.85, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        double triangleBArea = triangleB.findArea();
        System.out.println("Area of Triangle A is " + triangleAArea);
        System.out.println("Area of Triangle A is " + triangleBArea);

        // Accessing instance attribute variable for triangle A 
        System.out.println("Base of Triangle A is " + triangleA.base);

        System.out.println("Number of Sides of Triangle " + Triangle.numOfSides);
    }
}