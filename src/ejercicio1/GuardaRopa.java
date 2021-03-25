package ejercicio1;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    private HashMap<Integer, List<Prenda>> prendas = new HashMap<Integer, List<Prenda>>();
    private int contador;

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        prendas.put(contador++, listaDePrendas);
        return contador - 1;
    }

    public void mostrarPrendas() {
        for (Integer key : prendas.keySet()) {
            System.out.println(key + ": ");
            for (Prenda prenda:prendas.get(key)) {
                System.out.println(prenda);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return prendas.remove(numero);
    }
}
