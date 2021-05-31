public class Color {

  // El término "static" indica que se creará una copia y se compartirá a la clase, que se convertirá en "dueña".

 //Definimos los atributos iniciales de la clase color, numberOfColors es static por lo que se compartirá en main

  String name;
  static int numberOfColors;

  Color(String name){
    this.name = name;
    numberOfColors++;
  }

  //lo mismo ocurre con los métodos

  static void displayColors(){
    System.out.println("You have "+numberOfColors+" colors");
  }
}

