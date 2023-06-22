package com.egg.ejercicioextrapooclasevehiculo;

import Entidad.Vehiculo;
import Servicio.ServicioVehiculo;
/**
 *
 * @author zero
 */
public class EjercicioExtraPOOClaseVehiculo {

    public static void main(String[] args) {
        ServicioVehiculo serVeh = new ServicioVehiculo();
        
//        Vehiculo veh1 = serVeh.crearVehiculo();
        
        Vehiculo veh2 = new Vehiculo("Rolls Royce", "El de Trump", 1986,1);
        Vehiculo veh3 = new Vehiculo("Mazda", "El toreto", 2024,2);
        Vehiculo veh4 = new Vehiculo("Menzo", "Para repartir empanadas", 2022,3);

       
        
//        System.out.println(veh1.toString());
        
        serVeh.pruebaDeVelocidad(veh2);
        serVeh.pruebaDeVelocidad(veh3);
        serVeh.pruebaDeVelocidad(veh4);
    }
}
