// El modificador implements hace referencia a una interfaz creada
public class Rat implements Prey{
    // Recuerda sobreescribir y volver público el método
   @Override
   public void run(){
       System.out.println("The rat must run out");
   } 
}
