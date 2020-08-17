public class Triangle{

    static int numOfSides = 3;

    double base;
    double height;
    double sideLen1;
    double sideLen2;
    double sideLen3;

    //Constructor
    public Triangle(double base, double height,double sideLen1, double sideLen2, double sideLen3){
        this.base = base;
        this.height = height;
        this.sideLen1 = sideLen1;
        this.sideLen2 = sideLen2;
        this.sideLen3 = sideLen3;
    }

    // Instance Methods
    public double findArea(){
        return (this.base * this.height) / 2;
    }
}