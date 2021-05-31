// La encapsulación te permite proteger los atributos de la clase, elementos como el modifiicador private y los métodos getter and setter permiten esto.

class Main {
  public static void main(String[] args) {
    Instrument guitar = new Instrument("electric guitar", "Fender", 2016);

    System.out.println(guitar.getType());
    System.out.println(guitar.getBrand());
    System.out.println(guitar.getYear());    
  }
}