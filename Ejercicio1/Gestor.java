
import java.util.ArrayList;
import java.util.List;

public class Gestor {
    private int cantidad;
    private List<viajeroFrecuente>viajero;

    public Gestor(int cantidad){
        this.cantidad= cantidad;
        this.viajero= new ArrayList<viajeroFrecuente>();

    }
    
    public void CargarViajero(viajeroFrecuente pasajero){
        int cant=0;
        if (cant<cantidad){
            viajero.add(pasajero);
            cant++;
        }
        else{
            System.out.println("No es posible agregar viajero ya que se excedio de la cantidad");
        }
    }

    public void MostrarPorNum(int num){
        int i=0;
        boolean bandera= false;
        while (i<viajero.size() && bandera== false){
            viajeroFrecuente pasajero= viajero.get(i);
            if(pasajero.getNumero()== num){
                System.out.println(pasajero);
                bandera= true;
            }
            i++;
        }
    }
    public void MostrarPorDni(String dni){
        int i=0;
        boolean bandera= false;
        while (i<viajero.size() && bandera== false){
            viajeroFrecuente pasajero= viajero.get(i);
            if(pasajero.getDni().equals(dni)){
                System.out.println(pasajero.getDni());
                bandera= true;
            }
            i++;
        }
    }

    public void AcumularMillas(String dni, int millas){
        int i=0;
        boolean bandera= false;
        while (i<viajero.size() && bandera== false){
            viajeroFrecuente pasajero= viajero.get(i);
            if(pasajero.getDni().equals(dni)){
                pasajero.setIncrementarMillas(millas);
            }
            i++;
        }
    }
    public void CanjearMillas(String dni, int millas){
        int i=0;
        boolean bandera= false;
        while (i<viajero.size() && bandera== false){
            viajeroFrecuente pasajero= viajero.get(i);
            if(pasajero.getDni().equals(dni)){
                pasajero.setDecrementarMillas(millas);
            }
            i++;
        }
    }

    public void MejorViajero(){
        int max=0;
        viajeroFrecuente mejor= null;
        for (int i=0;i< viajero.size(); i++ ) {
            viajeroFrecuente pasajero= viajero.get(i);
            if(pasajero.getMillas()>max){
                max= pasajero.getMillas();
                mejor= pasajero;
            }  
        }
        System.out.println(mejor);
    }

}
