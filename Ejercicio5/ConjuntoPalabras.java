import java.util.ArrayList;
import java.util.List;

public class ConjuntoPalabras {
    List<Palabra> palabra;

    public ConjuntoPalabras(){
        palabra= new ArrayList<>();
    }

    public void AgregarPalabra(Palabra p){
        palabra.add(p);
    }

    public Palabra BuscarPalabra(String palabrabuscar){
        for (Palabra p : palabra) {
            if(p.GetPalabra().equals(palabrabuscar)){
                return p;
            }
        }
        return null;
    }

    public void Incrementar(Palabra pal){
        for (Palabra p : palabra) {
            if(p.GetPalabra().equals(pal.GetPalabra())){
                p.SetCantidadVeces(p.GetCantidadVeces()+1);
            }
        }
    }

    public void Mostrar(){
        System.out.println("Lista de Palabras");
        for (Palabra p: palabra){
            System.out.println("'"+p.GetPalabra()+"'" + " aparece "+ p.GetCantidadVeces()+" veces");

        }
        System.out.println("------------------------");
    }
}
