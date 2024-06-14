import java.util.Scanner;

public class Ejericico1 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.println("Ingrese cantidad de viajeros: ");
        int cant= op.nextInt();
        Gestor gestor= new Gestor(cant);
        int opc= -1;
        
        
        while (opc != 0){
            System.out.println("1. Agregar viajeros ");
            System.out.println("2. Mostrar viajeros ");
            System.out.println("3. Consultar millas ");
            System.out.println("4. Acumular millas ");
            System.out.println("5. Canjear millas ");
            System.out.println("6. Mejor viajero ");
            System.out.println("0. salir ");
            
            if(op.hasNext()){
                opc= op.nextInt();
                
            }
                else{
                    System.out.println("Ingrese un numero correcto ");
                    op.next();
                    continue;
                }
            
            switch (opc){
            
                case 1:
                    System.out.println("Ingrese numero de viajero: ");
                    int numero=op.nextInt();
                    System.out.println("Ingrese Dni: ");
                    String dni= op.nextLine();
                    System.out.println("Ingrese Nombre: ");
                    String nombre= op.nextLine();
                    System.out.println("Ingrese Apellido: ");
                    String apellido= op.nextLine();
                    System.out.println("Ingrese millas de viajero: ");
                    int millas=op.nextInt();
                    viajeroFrecuente viajeros= new viajeroFrecuente(numero, dni, nombre, apellido, millas );
                    gestor.CargarViajero(viajeros);
                    break;
                case 2:
                    System.out.println("Ingrese numero de viajero: ");
                    numero= op.nextInt();
                    gestor.MostrarPorNum(numero);
                    break;
                case 3:
                    System.out.println("Ingrese Dni de viajero: ");
                    dni= op.nextLine();
                    gestor.MostrarPorDni(dni);
                
                case 4:
                    System.out.println("Ingrese Dni de viajero: ");
                    dni= op.nextLine();
                    System.out.println("Ingrese cantidad de millas a acumular: ");
                    millas= op.nextInt();
                    gestor.AcumularMillas(dni, millas);
                
                case 5:
                    System.out.println("Ingrese Dni de viajero: ");
                    dni= op.nextLine();
                    System.out.println("Ingrese cantidad de millas a acumular: ");
                    millas= op.nextInt();
                    gestor.CanjearMillas(dni, millas);
                
                case 6:
                    gestor.MejorViajero();
            }
        
            }
        op.close();
        
        
    }
      
    }
    

