public class Main {
  public static void main(String[] args) {
    Color color1 = new Color("red");
    Color color2 = new Color("blue");
    Color color3 = new Color("green");

  //Es posible hacer la referencia a numberOfColors directamente desde Color por el midficador static, de no ser así nos mostraría el error de que no es posible referenciar la variable no estática numberOfColors en un contexto estático, pero sí sería posible referenciando un objeto como tal, ya que todos comparten el mismo valor

    System.out.println(Color.numberOfColors);

  // También pueder referenciar métodos directamente desde el objeto
  
    Color.displayColors();    
  }
}