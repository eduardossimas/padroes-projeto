package atividadeFabricas;

public class ContratoPJ extends Contrato{
    public ContratoPJ (Procuracao procuracao) {
        super(procuracao);
    }
    public String exibir() {
        return "Contrato PJ";
    }
}
