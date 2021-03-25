package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Prenda p1 = new Prenda("Nike", "buzo");
        Prenda p2 = new Prenda("Adidas", "pantalon");

        GuardaRopa guardaRopa = new GuardaRopa();

        List prendasAGuardar = new ArrayList<Prenda>();
        prendasAGuardar.add(p1);
        prendasAGuardar.add(p2);
        Integer num1 = guardaRopa.guardarPrendas(prendasAGuardar);

        guardaRopa.mostrarPrendas();

        List prendasDevueltas = guardaRopa.devolverPrendas(num1);

        System.out.println("Prendas devueltas: Guarda ropa vacio");
        guardaRopa.mostrarPrendas();
    }
}
