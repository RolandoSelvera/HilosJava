public class Hilo implements Runnable{

    private String texto = "Hola, soy un hilo en consola :v";

    // Constructor de la clase:
    public Hilo (){
    }

    @Override
    public void run() {
        // Instrucciones o acciones a realizar dentro del hilo...
        System.out.println(texto);
    }

}