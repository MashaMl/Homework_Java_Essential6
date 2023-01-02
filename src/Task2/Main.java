package Task2;

enum Animals {
   CAT(10), DOG(20), PIG(30);
   int age;
   Animals(int age) {this.age = age;}
    public String toString() {
        return "Animal - " + super.toString() + ", age - " + this.age;
    }

}

public class Main {
    public static void main(String[] args) {
        Animals animal = Animals.CAT;
        System.out.println(animal.toString());
    }
}
