package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Fiesta fiesta = new Fiesta();
        Invitado i1 = new InvitadoMeli("Juan");
        Invitado i2 = new InvitadoMeli("Pedro");
        Invitado i3 = new InvitadoStandard("Jose");

        fiesta.agregarInvitado(i1);
        fiesta.agregarInvitado(i2);
        fiesta.agregarInvitado(i3);

        FuegoArtificial f1 = new FuegoArtificial("Pummm!!");
        FuegoArtificial f2 = new FuegoArtificial("Bam!!");

        FuegoArtificial pf1 = new FuegoArtificial("Pack 1!!");
        FuegoArtificial pf2 = new FuegoArtificial("Pack 2!!");
        PackFuegosArtificiales p1 = new PackFuegosArtificiales();
        p1.agregarFuego(pf1);
        p1.agregarFuego(pf2);

        fiesta.agregarFuegoArtificial(f1);
        fiesta.agregarFuegoArtificial(f2);
        fiesta.agregarFuegoArtificial(p1);

        fiesta.cortarTorta();
    }
}
