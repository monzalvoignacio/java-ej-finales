package ejercicio2;

public class Main {
    public static void main(String[] args)
    {
        Carrera carrera = new Carrera(100 , 1000, "Grand Prix", 10);
        carrera.darDeAltaAuto(100, 10, 30, "A1");
        carrera.darDeAltaAuto(180, 8, 30, "A2");
        carrera.darDeAltaAuto(60, 6, 30, "A3");
        carrera.darDeAltaAuto(40, 4, 30, "A4");
        carrera.darDeAltaMoto(400, 4, 30, "M1");

        System.out.println(carrera.ganador());

        carrera.socorrerAuto("A1");
    }
}
