public class Main{
    public static void main(String[] args){
        // interface hace referencia a una plantilla que puede ser aplicada a una clase como la herencia, pero no te limita a una sola clase
        Dog dog = new Dog();
        Cat cat = new Cat();
        Rat rat = new Rat();
    
        rat.run();
        dog.hunt();

        //El gato puede utilizar tanto métodos de la clase presa como de la clase depredador
        
        cat.run();
        cat.hunt();
    }
}