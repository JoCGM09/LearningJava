public class Instrument{

// Para encapsular los atributos colocas el modificador private para que estos atributos no puedan ser accedidos fuera de esta clase.

  private String type;
  private String brand;
  private int year;

// Una mejor práctica de encapsulación es usar el setter para asignar valores a los atributos iniciales.

  Instrument(String type, String brand, int year){
    this.setType(type);
    this.setBrand(brand);
    this.setYear(year);
  } 

// Los métodos getter sirven para obtener los valores de los atributos ya que no pueden ser accedidos directamente.

  public String getType(){
    return type;
  }
  public String getBrand(){
    return brand;
  }
  public int getYear(){
    return year;
  }

// Los métodos setter sirven para asignar valores a los atributos privados de la clase. Se utiliza en el constructor para definir los valores iniciales pero también se usan para validar datos antes de almacenarlos y para modificar los atributos desde fuera de la clase (public).   

  public void setType(String type){
    this.type = type;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public void setYear(int year){
    this.year = year;
  }
}