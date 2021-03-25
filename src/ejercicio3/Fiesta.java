package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fiesta {
    public List<Invitado> invitados = new ArrayList<Invitado>();
    public List<Explosivo> fuegosArtificiales = new ArrayList<Explosivo>();

    public void agregarInvitado(Invitado i) {
        invitados.add(i);
    }

    public void agregarFuegoArtificial(Explosivo e) {
        fuegosArtificiales.add(e);
    }

    public void cortarTorta() {
        for (Invitado i:invitados) {
            if (i instanceof InvitadoMeli) {
                System.out.println("Viva la Chiqui!!");
            }
        }

        for (Explosivo e:fuegosArtificiales) {
            System.out.println(e.explosion());
        }
    }
}
