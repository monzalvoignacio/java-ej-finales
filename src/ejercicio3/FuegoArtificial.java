package ejercicio3;

public class FuegoArtificial implements Explosivo{
    private String ruido;

    @Override
    public String explosion() {
        return ruido;
    }

    public FuegoArtificial(String ruido) {
        this.ruido = ruido;
    }
}
