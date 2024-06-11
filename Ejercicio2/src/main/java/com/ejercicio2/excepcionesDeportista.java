package com.ejercicio2;

public class excepcionesDeportista extends Exception{
    public excepcionesDeportista(){
        super();
    }
    public excepcionesDeportista(String mensaje){
        super(mensaje);
    }

    public excepcionesDeportista(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
    
    public excepcionesDeportista(Throwable causa){
        super(causa);
    }
}
