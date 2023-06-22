package Servicio;
import Entidad.Vehiculo;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioVehiculo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vehiculo crearVehiculo() {
        Vehiculo v = new Vehiculo();
        
        System.out.println("Bienvenido\nTipos de vehiculo:\n1 - Automovil"
                + "\n2 - Motocicleta\n3 - Bicicleta\n");
        int tipo;
        do {
            System.out.println("Ingrese el tipo");
            tipo = leer.nextInt();
            if(tipo < 1 || tipo > 3) {
                System.out.println("Tipo invalido, intenta de nuevo");
            } 
        } while (tipo < 1 || tipo > 3);
        v.setTipo(tipo);
        
        System.out.println("Ingrese la marca > ");
        v.setMarca(leer.next());
        
        System.out.println("Ingrese el modelo > ");
        v.setModelo(leer.next());
        
        System.out.println("¿Que año es su vehiculo?");
        v.setAnio(leer.nextInt());
        
        return v;
    }
    
    public void pruebaDeVelocidad(Vehiculo v) {
        System.out.println("El vehiculo 1 se movera " + v.moverse(5) + " metros"
        + " al avanzar 5 segundos, " + v.moverse(10) + " si lo hace 10"
        + " segundos y " + v.moverse(60) + " por un minuto");
    }
}
