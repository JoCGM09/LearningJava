// Copiar un objeto en otro

class Main {
  public static void main(String[] args) {
    Instrument guitar = new Instrument("electric guitar", "Fender", 2016);

// Al crear la instancia del objeto se le coloca como parámetro en el constructor el objeto que se desea copiar
    Instrument guitar2 = new Instrument(guitar);

    System.out.println(guitar.getType());
    System.out.println(guitar.getBrand());
    System.out.println(guitar.getYear()); 

    System.out.println(guitar2.getType());
    System.out.println(guitar2.getBrand());
    System.out.println(guitar2.getYear());    
  }
}