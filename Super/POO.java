// Clase hijo

public class POO extends Subject{
  String req;

  // El modificador super representa el uso de la clase padre en la clase hijo, aplica tanto para el constructor, que toma los atributos, y sobre los métodos, para usar los métodos de la clase padre. 

  POO(int code, String name, String req){

    //En el constructor del hijo usamos super para realizar la "creación" del padre dentro del hijo

    super(code, name);
    this.req = req;
  }
  
  public String toString(){

    // En este caso el término super hace referencia al padre llamando al método toString del padre sobre el hijo

    return super.toString() + this.req;
  }

}