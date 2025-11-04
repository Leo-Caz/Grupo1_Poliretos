package appinfo;

public class InformacionGrupo {
    private final int numeroGrupo;
    private final String[] integrantes;

    public InformacionGrupo(int numeroGrupo, String[] integrantes) {
        this.numeroGrupo = numeroGrupo;
        this.integrantes = integrantes.clone();
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public String[] getIntegrantes() {
        return integrantes.clone();
    }

    public void mostrarResumen() {
        System.out.println("Grupo: " + numeroGrupo);
        System.out.println("Integrantes:");
        for (String integrante : integrantes) {
            System.out.println("  - " + integrante);
        }
    }
}
