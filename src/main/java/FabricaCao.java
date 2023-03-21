public class FabricaCao implements FabricaAbstrata{

    @Override
    public Brinquedo createBrinquedo() {
        return new BrinquedoCao();
    }

    @Override
    public Racao createRacao() {
        return new RacaoCao();
    }
}
