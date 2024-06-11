import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Filter;

public class Gestor {
    private int cantidad;
    private List<viajeroFrecuente>viajero;
    public Gestor(int cantida){
        this.cantidad=cantida;
        this.viajero= new ArrayList<viajeroFrecuente>(); 
    }

    public void AgregarViajero(viajeroFrecuente viajeros){
        long count= viajero.stream().count();
        if(count<cantidad){
            viajero.add(viajeros);
        }
        else{
            System.out.println("Se excedio de la cantidad de viajeros");
        }
    }

    public void MostrarCantidadeViajeros(){
        viajero.stream()
        .sorted(Comparator.comparing(viajeroFrecuente :: getMillas))
        .forEach(System.out::println);
    }

    public void NombreViajeros(){
        viajero.stream()
        .filter(v->v.getMillas()>200)
        .map(viajeroFrecuente::getNombre)
        .forEach(System.out::println);
    }
    public void ViajeroMAsMillas(){
        Optional<viajeroFrecuente> elmejor= viajero.stream()
        .max(Comparator.comparing(viajeroFrecuente::getMillas));

        System.out.println(elmejor.orElse(null));

    }
}
