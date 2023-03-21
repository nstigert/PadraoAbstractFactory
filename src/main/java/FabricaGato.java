public class FabricaGato implements FabricaAbstrata{
    @Override
    public Brinquedo createBrinquedo() {
        return new BrinquedoGato();
    }

    @Override
    public Racao createRacao() {
        return new RacaoGato();
    }
}
