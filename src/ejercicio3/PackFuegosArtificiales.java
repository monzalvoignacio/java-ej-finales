package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PackFuegosArtificiales implements Explosivo{
    private List<FuegoArtificial> pack = new ArrayList<FuegoArtificial>();

    public void agregarFuego(FuegoArtificial fa) {
        pack.add(fa);
    }

    @Override
    public String explosion() {
        String ret = "";
        for (FuegoArtificial f:pack) {
            ret += f.explosion();
        }

        return ret;
    }
}
