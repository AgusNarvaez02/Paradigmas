public class Palabra {
    private String palabra;
    private int cantidadVeces;

    public Palabra(String palabra){
        this.palabra= palabra;
        this.cantidadVeces=1;
    }

    public void SetPalabra(String palabra){
        this.palabra=palabra;
    }
    
    public String GetPalabra(){
        return this.palabra;
    }
    
    public void SetCantidadVeces(int cantidad){
        this.cantidadVeces=cantidad;
    }
    public int GetCantidadVeces(){
        return this.cantidadVeces;
    }

    @Override
    public String toString() {
        return "palabra"+ this.palabra + "Cantidad" + this.cantidadVeces;
    }

   
     
}
