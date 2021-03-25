package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private int distancia;
    private int premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private SocorristaAuto socorristaAuto = new SocorristaAuto();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Carrera(int distancia, int premioEnDolares, String nombre, int cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public void darDeAltaAuto(int velocidad, int aceleracion,int anguloDeGiro, String patente) {
        Auto auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        vehiculos.add(auto);
    }

    public void darDeAltaMoto(int velocidad, int aceleracion,int anguloDeGiro, String patente) {
        Moto moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        vehiculos.add(moto);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String unaPatente) {
        vehiculos.removeIf(v -> v.getPatente().equals(unaPatente));
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(int premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Vehiculo ganador() {
//        Velocidad * 1⁄2 Aceleracion / (AnguloDeGiro*(Peso-Cantidad de Ruedas * 100)
        float max = -1;
        Vehiculo ret = vehiculos.get(0);
        for (Vehiculo v:vehiculos) {
            float res = v.getVelocidad()/2 + (v.getAceleración()/(v.getAnguloDeGiro()*(v.getPeso() - (v.getRuedas() * 100))));
            if(res > max) {
                max = res;
                ret = v;
            }
        }
        return ret;
    }

    public void socorrerAuto(String patente) {
        Vehiculo vehiculo = vehiculos.stream()
                .filter(v -> patente.equals(v.getPatente()))
                .findAny()
                .orElse(null);
        if (vehiculo instanceof Auto) {
            socorristaAuto.socorrer((Auto) vehiculo);
        } else {
            System.out.println("El vehiculo no es un auto");
        }
    }
    public void socorrerMoto(String patente) {
        Vehiculo vehiculo = vehiculos.stream()
                .filter(v -> patente.equals(v.getPatente()))
                .findAny()
                .orElse(null);
        if (vehiculo instanceof Moto) {
            socorristaMoto.socorrer((Moto) vehiculo);
        } else {
            System.out.println("El vehiculo no es una moto");
        }
    }
}
