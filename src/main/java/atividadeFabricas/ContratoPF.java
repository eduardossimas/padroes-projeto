package atividadeFabricas;

public class ContratoPF extends Contrato{
    public ContratoPF (Procuracao procuracao) {
        super(procuracao);
    }
    public String exibir() {
        return "Contrato PF";
    }
}
