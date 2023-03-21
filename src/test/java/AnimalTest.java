import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void deveRetornarTipoRacaoCao() {
        FabricaAbstrata fabrica = new FabricaCao();
        Animal animal = new Animal(fabrica);
        assertEquals("Racao para Cao", animal.tipoRacao());
    }

    @Test
    void deveRetornarTipoRacaoGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Animal animal = new Animal(fabrica);
        assertEquals("Racao para Gato", animal.tipoRacao());
    }

    @Test
    void deveRetornarTipoBrinquedoCao() {
        FabricaAbstrata fabrica = new FabricaCao();
        Animal animal = new Animal(fabrica);
        assertEquals("Brinquedo Cao", animal.tipoBrinquedo());
    }

    @Test
    void deveRetornarTipoBrinquedoGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Animal animal = new Animal(fabrica);
        assertEquals("Brinquedo Gato", animal.tipoBrinquedo());
    }

}