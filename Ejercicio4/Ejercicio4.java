import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Gestor gestor = new Gestor(5);
        gestor.AgregarViajero(new viajeroFrecuente(1, "12345678", "Juan", "Perez", 100));
        gestor.AgregarViajero(new viajeroFrecuente(2, "23456789", "Maria", "Gomez", 300));
        gestor.AgregarViajero(new viajeroFrecuente(3, "34567890", "Carlos", "Lopez", 150));
        gestor.AgregarViajero(new viajeroFrecuente(4, "45678901", "Ana", "Martinez", 250));
        gestor.AgregarViajero(new viajeroFrecuente(5, "56789012", "Lucia", "Rodriguez",200));
        
        
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Mostrar todos los viajeros ordenados por cantidad de millas");
            System.out.println("2. Mostrar viajeros con mas de 200 millas");
            System.out.println("3. Mostrar mejor viajero");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    gestor.MostrarCantidadeViajeros();;
                    break;
                case 2:
                    gestor.NombreViajeros();
                    break;
                case 3:
                    gestor.ViajeroMAsMillas();;
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    in.close();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 4);
    }
    }

