package atividadeFabricas;

public abstract class Contrato {
    protected Procuracao procuracao; // Bridge

    public Contrato(Procuracao procuracao) {
        this.procuracao = procuracao;
    }

    public abstract String exibir();
}
