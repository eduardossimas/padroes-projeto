package atividadeFabricas;

public class FabricaPF implements FabricaAbstrata{
    public Contrato criarContrato() {
        return new ContratoPF(criarProcuracao());
    }

    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}
