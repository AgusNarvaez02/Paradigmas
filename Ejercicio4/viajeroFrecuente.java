public class viajeroFrecuente {
    private int numero;
    private String dni;
    private String nombre;
    private String apellido;
    private int millas;


    public viajeroFrecuente(int numero, String dni, String nombre, String apellido, int millas){
        this.numero=numero;
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.millas=millas;
    }

    public int getNumero(){
        return this.numero;
    }
    
    public String getDni(){
        return this.dni;
    }

    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getMillas(){
        return this.millas;
    }
    public void setNumero(int num){
        this.numero=num;
    }
    public void setMillas(int num){
        this.millas=num;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    @Override
    public String toString(){
        return "ViajeroFrecuente [apellido=" + apellido + ", dni=" + dni + ", millas=" + millas + ", nombre=" + nombre
        + ", numero=" + numero + "]";
    }

    
}
