public class Animal {

    private Racao racao;
    private Brinquedo brinquedo;

    public Animal (FabricaAbstrata fabrica) {
        this.racao = fabrica.createRacao();
        this.brinquedo = fabrica.createBrinquedo();
    }

    public String tipoRacao() {
        return this.racao.tipo();
    }

    public String tipoBrinquedo() {
        return this.brinquedo.tipo();
    }
}
