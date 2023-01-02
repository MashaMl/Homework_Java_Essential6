package Task4;

enum Vehicles {
    BMW("black", 1000), MERS("red", 10000), TOYOTA("white", 100);
    String color;
    int cost;
    Vehicles(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }
    public String getColor() { return color; }
    public String toString() { return "Car - " + super.toString() + ", color - " + color + ", cost - " + cost;};

}

public class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.BMW;
        System.out.println(car.getColor());
        System.out.println(car.toString());
    }

}
