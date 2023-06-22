package Entidad;

/**
 *
 * @author zero
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, int tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + '}';
    }
    
    public int moverse(int seg) {
        int metros = 0;
        tipo = this.tipo;
        int vel = 0;
        
        switch(tipo) {
            case 1: vel = 3;break;
            case 2: vel = 2;break;
            case 3: vel = 1;break;
        }
        
        metros = vel * seg;
        return metros;
    }
    
    public int frenar() {
        int metros = 0;
        tipo = this.tipo;
        
        if(tipo == 3) {
            metros = 0;
        } else {
            metros = 2;
        }
       
        return metros;
    }
}
