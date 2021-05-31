public class Tiger extends Animal{
  
  // El método description debe ser sobreescrito ya que en la clase Animal, este tiene el modificador abstract
  // @Override es un indicador de sobreescritura, no modifica el código pero es una buena práctica colocarlo como indicación al código 

  @Override
  void description(){
    System.out.println("The tiger has many stripes on the body");
  }
}