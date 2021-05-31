public class Main {
  public static void main(String[] args) {
    
    //inheritance (herencia) = una clase toma todos los atribuos y métodos de una clase existente
    
    Car car = new Car();

    car.go();

    Bicycle bike = new Bicycle();

    bike.stop();

    System.out.println(car.doors);
    System.out.println(bike.pedals);
}