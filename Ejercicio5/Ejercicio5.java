public class Ejercicio5{
    public static void main(String[] args) {
        ConjuntoPalabras Texto= new ConjuntoPalabras();

        long inicio= System.currentTimeMillis();
        Thread h1= new Hilo("1", "C:\\Users\\Usuario\\Documents\\paradigma\\Java\\ParadigmasDeLenguaje-main\\Ejercicio5\\texto1.txt", Texto);
        Thread h2= new Hilo("2", "C:\\Users\\Usuario\\Documents\\paradigma\\Java\\ParadigmasDeLenguaje-main\\Ejercicio5\\texto2.txt", Texto);
        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ex) {
            System.out.println("Hilo interrumpido");
        }
        Texto.Mostrar();
    }
}