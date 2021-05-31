public class Instrument{

  private String type;
  private String brand;
  private int year;

  Instrument(String type, String brand, int year){
    this.setType(type);
    this.setBrand(brand);
    this.setYear(year);
  } 

//2. Utilizar el overloading constructor para tener un constructor que también reciba un objeto DEFINIDO x, y hacerle referencia con el método copy.

  Instrument(Instrument x){
    this.copy(x);
  }

  public String getType(){
    return type;
  }
  public String getBrand(){
    return brand;
  }
  public int getYear(){
    return year;
  } 

  public void setType(String type){
    this.type = type;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public void setYear(int year){
    this.year = year;
  }

// 1. Crear un método copy que recibe como parámetro un objeto DEFINIDO x, luego referenciamos a él mismo con this para setear valores con el setter que reciban los getter del objeto x. 
 
  public void copy(Instrument x){
    this.setType(x.getType());
    this.setBrand(x.getBrand());
    this.setYear(x.getYear());
  }
}