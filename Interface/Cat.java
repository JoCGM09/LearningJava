// Una clase puede hacer referencia a más de una interfaz, a diferencia de la herencia
public class Cat implements Prey,Predator{
    
    @Override
    public void run(){
        System.out.println("Cat must run from dog");
    }
    @Override
    public void hunt(){
        System.out.println("Cat must hunt rat");
    }

}
