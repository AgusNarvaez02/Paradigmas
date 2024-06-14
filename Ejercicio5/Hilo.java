import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Hilo extends Thread {
    private String numeroHilo;
    private String rutaArchivo;
    private ConjuntoPalabras datos;
    
    public Hilo(String numero, String ruta, ConjuntoPalabras datos){
        this.numeroHilo= numero;
        this.rutaArchivo= ruta;
        this.datos= datos;
    }
    public String limpiarSignos(String texto){
        texto = texto.replaceAll("[^a-zA-Z0-9]", " ");
        return texto;
    }

    
    public String limpiarStopWords(String[] texto){ 
        String[] stopWords = {"a", "el", "la", "los", "las", "y", "o", "u", "de", "del", "al", "en", "con", "por", "para", "si", "no", "ni", "pero", "aunque", "sin", "sobre", "tras", "durante", "mientras", "cuando", "donde", "quien", "cual", "cuyo", "cuya", "cuyos", "cuyas", "que", "cual", "cuyas", "cuyos", "cuya", "cuyas", "cuyo", "cuyos"};
        Set<String> stopWordsSet = Arrays.stream(stopWords).collect(Collectors.toSet());

        String textoLimpio = Arrays.stream(texto)
            .filter(word -> !stopWordsSet.contains(word))
            .collect(Collectors.joining(" "));

        return textoLimpio;
    }

    public String[] Retorna (){
        String texto = "";
        try {
            texto = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(rutaArchivo)));
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo");
        }
        texto = texto.toLowerCase();
        texto = limpiarSignos(texto);
        String[] palabras = texto.split(" ");
        palabras = limpiarStopWords(palabras).split(" ");
        return palabras;
    }
    @Override
    public void run(){
        Palabra p;
        for (String palabra: Retorna()){
            if(!(palabra.equals(""))){
                synchronized (datos) {
                    p=datos.BuscarPalabra(palabra);
                    if(p==null){
                        Palabra nuevaPalabra= new Palabra(palabra);
                        datos.AgregarPalabra(nuevaPalabra);
                    }
                    else{
                        datos.Incrementar(p);
                    }
                }
            }
        }

    }
    
}
