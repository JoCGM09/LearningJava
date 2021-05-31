// Clase padre

public class Subject{
  int code;
  String name;

  Subject(int code, String name){
    this.code = code;
    this.name = name;
  }

  public String toString(){
    return this.code + "\n" + this.name + "\n";
  }
}
