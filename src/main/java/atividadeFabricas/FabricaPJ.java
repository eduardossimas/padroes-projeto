package atividadeFabricas;

public class FabricaPJ implements FabricaAbstrata{
    public Contrato criarContrato() {
        return new ContratoPJ(criarProcuracao());
    }

    public Procuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }
}
